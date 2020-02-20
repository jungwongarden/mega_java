package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class 그래픽연습2 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(636, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(30, 44, 89, 66);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(131, 44, 89, 66);
		f.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(435, 44, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		f.setVisible(true);
	}
}
