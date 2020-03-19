package db연결;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		JScrollPane jScrollPane = new JScrollPane();//스크롤팬 생성
		JPanel panel_ex = new JPanel();//스크롤팬에 붙일 패널 생성
		Dimension size = new Dimension();//사이즈를 지정하기 위한 객체 생성
		size.setSize(500,800);//객체의 사이즈를 지정
		panel_ex.setPreferredSize(size);//사이즈 정보를 가지고 있는 객체를 이용해 패널의 사이즈 지정
		jScrollPane.setViewportView(panel_ex);//스크롤 팬 위에 패널을 올린다.
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + " ");
			panel_ex.add(b);
		}
		f.add(jScrollPane, BorderLayout.WEST);
		
		JScrollPane jScrollPane2 = new JScrollPane();//스크롤팬 생성
		JPanel panel_ex2 = new JPanel();//스크롤팬에 붙일 패널 생성
		Dimension size2 = new Dimension();//사이즈를 지정하기 위한 객체 생성
		size2.setSize(500, 500);//객체의 사이즈를 지정
		panel_ex2.setPreferredSize(size2);//사이즈 정보를 가지고 있는 객체를 이용해 패널의 사이즈 지정
		jScrollPane2.setViewportView(panel_ex2);//스크롤 팬 위에 패널을 올린다.
		f.add(jScrollPane2, BorderLayout.EAST);
		
		JScrollPane jScrollPane3 = new JScrollPane();//스크롤팬 생성
		JPanel panel_ex3 = new JPanel();//스크롤팬에 붙일 패널 생성
		Dimension size3 = new Dimension();//사이즈를 지정하기 위한 객체 생성
		size3.setSize(1000, 100);//객체의 사이즈를 지정
		panel_ex3.setPreferredSize(size3);//사이즈 정보를 가지고 있는 객체를 이용해 패널의 사이즈 지정
		jScrollPane3.setViewportView(panel_ex3);//스크롤 팬 위에 패널을 올린다.
		f.add(jScrollPane3, BorderLayout.NORTH);
		
		f.setVisible(true);
		

	}

}
