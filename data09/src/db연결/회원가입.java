package db연결;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				가입창 sign = new 가입창();
				sign.signIn();
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 70));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);

		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리 db = new DB처리();
				db.delete();			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 70));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);

		JButton btnNewButton_2 = new JButton("DB연결");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리 db = new DB처리();
				db.connect();
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 53));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("회원수정");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리 db = new DB처리();
				db.update();
			}
		});
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		f.setVisible(true);
	}

}
