package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 가위바위보게임3 {
	static int count = 0;
	
	public static void main(String[] args) {
		// 1. 프레임에 해당하는 클래스 필요.
		JFrame f = new JFrame();
		f.setSize(971, 518);
		f.setTitle("가위 바위 보 게임");
		JLabel result = new JLabel("\uAC8C\uC784 \uACB0\uACFC \uB098\uD0C0\uB0A0 \uC790\uB9AC");

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				//result.setText("가위를 눌렀음");				
				//JOptionPane.showMessageDialog(null, "가위를 눌렀음");
				//컴퓨터가 내게 함.
				//나와 컴퓨터와 비교해서 승패 확인
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //가위 
					result.setText("비김");
				}
				if (computer == 1) { //바위
					result.setText("컴퓨터 승");
				}
				if (computer == 2) { //보
					result.setText("나 승");
				}
				f.setTitle("가위 바위 보 게임** 총게임횟수: " + count);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uAC00\uC704.png"));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				//result.setText("바위를 눌렀음");	
				//JOptionPane.showMessageDialog(null, "바위를 눌렀음");
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //가위 
					result.setText("나 승");
				}
				if (computer == 1) { //바위
					result.setText("비김");
				}
				if (computer == 2) { //보
					result.setText("컴퓨터 승");
				}
				f.setTitle("가위 바위 보 게임** 총게임횟수: " + count);
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uBC14\uC704.png"));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				//result.setText("보를 눌렀음");	
				//JOptionPane.showMessageDialog(null, "보를 눌렀음");
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //가위 
					result.setText("컴퓨터 승");
				}
				if (computer == 1) { //바위
					result.setText("나 승");
				}
				if (computer == 2) { //보
					result.setText("비김");
				}
				f.setTitle("가위 바위 보 게임** 총게임횟수: " + count);
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uBCF4.png"));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);

		
		result.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(result, BorderLayout.SOUTH);

		f.setVisible(true);
	}

}
