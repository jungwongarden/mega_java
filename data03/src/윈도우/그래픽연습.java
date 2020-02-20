package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class 그래픽연습 {

	public static void main(String[] args) {
		//1. 프레임에 해당하는 클래스 필요.
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("\uAC00\uC6B4\uB370");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB294 \uC704\uC5D0 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("\uC67C\uCABD\uBC84\uD2BC");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("\uC624\uB978\uCABD\uBC84\uD2BC");
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("\uC544\uB798\uCABD \uBC84\uD2BC");
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

}
