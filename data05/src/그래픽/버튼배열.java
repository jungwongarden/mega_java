package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼배열 {
	static int i;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1100, 1000);
		//add한 순서대로 차례대로 배치
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		JButton[] list = new JButton[500];
//		for (i = 0; i < list.length; i++) {
//			list[i] = new JButton("버튼" + i);
//			f.add(list[i]);
//			list[i].addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println(list[i].getText() + "번째 예약됨.");
//					list[i].setText("예약");
//				}
//			});
//		}
		//System.out.println(list[0]); //주소
		
		for (int i = 0; i < 500; i++) {
			JButton b1 = new JButton("버튼" + i);
			f.add(b1);
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(b1.getText() + "예약됨.");
					b1.setText("예약");
					b1.setBackground(Color.red);
					b1.setForeground(Color.yellow);
				}
			});
		}
		f.setVisible(true);
	}
}







