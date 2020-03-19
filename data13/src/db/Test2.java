package db;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLayout(new GridLayout(0,2));
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		for (int i = 0; i < 100; i++) {
			JButton b = new JButton(i + "");
			p1.add(b);
		}
		JPanel p2 = new JPanel();
		p2.setBackground(Color.yellow);
		
		JScrollPane s1 = new JScrollPane(p1);
		JScrollPane s2 = new JScrollPane(p2);
		f.add(s1);
		f.add(s2);
		f.setVisible(true);
		
	}
}
