package 변수;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class 윈도우 {

	public static void main(String[] args) {
		//입력을 받을 때는 모든 타입이 String으로 처리!!!
//		String name = JOptionPane.showInputDialog("이름을 입력");
		//String age = JOptionPane.showInputDialog("나이를 입력");
		//당신의 주요 프로그래머 언어는 무엇인가요?
		//당신의 다음 언어는 무엇인가요?
		
		//System.out.println("당신의 이름은 " + name + "입니다.");
		//System.out.println("당신의 나이는 " + age + "세입니다.");
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JTree tree = new JTree();
		f.getContentPane().add(tree, BorderLayout.NORTH);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB9C8\uC9C0\uB9C9 \uC2DC\uAC04\uC778\uAC00\uC694?");
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(rdbtnNewRadioButton, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\uB098\uB294 \uBC84\uD2BC1");
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB3C4 \uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uB098\uB3C4 \uBC84\uD2BC3");
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setVisible(true);
		
		
		
		
		
	}
}
