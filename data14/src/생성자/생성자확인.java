package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 생성자확인 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 윈도우");
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		JButton b = new JButton("나를 눌러요");
		b.setBackground(Color.BLUE);
		b.setForeground(Color.yellow);
		f.add(b);
		f.setVisible(true);
	}
}







