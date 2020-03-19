package db;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test4 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLayout(null);
		JButton b = new JButton("Show!!!");
		b.setBounds(10, 10, 300, 100);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] title = {"영어", "수학", "국어"};
				Object[][] contents = {
						{100,200,100},{100,200,100},{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},
						{100,200,100},{100,200,100},{100,200,100},{100,200,100}
				};
				JTable table = new JTable(contents, title);
				//table.setFont(new Font("궁서", Font.BOLD, 50));
				
				JScrollPane s1 = new JScrollPane(table);
				s1.setBounds(300, 100, 300, 400);
				f.add(s1);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}
}
