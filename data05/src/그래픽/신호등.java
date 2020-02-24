package ±×·¡ÇÈ;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ½ÅÈ£µî {
	private static JTable table;
	private static JTable table_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.getContentPane().setBackground(Color.BLACK);
		f.setTitle("½ÅÈ£µî");
		f.setSize(301, 1000);
		f.setLayout(new FlowLayout());

		JButton red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setBounds(6, 5, 273, 75);
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("red.png");
				f.getContentPane().add(img);
				img.setIcon(icon);
//				f.setVisible(true);
			}
		});
		red.setFont(new Font("±¼¸²", Font.BOLD, 57));
		red.setBackground(Color.RED);
		f.getContentPane().add(red);

		JButton yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setBounds(6, 85, 273, 75);
		yellow.setFont(new Font("±¼¸²", Font.BOLD, 57));
		yellow.setBackground(Color.YELLOW);
		f.getContentPane().add(yellow);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("yellow.png");
				f.getContentPane().add(img);
				img.setIcon(icon);
				//f.setVisible(true);
			}
		});

		JButton blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setBounds(4, 165, 273, 75);
		blue.setFont(new Font("±¼¸²", Font.BOLD, 57));
		blue.setBackground(Color.BLUE);
		f.getContentPane().add(blue);
		
		table = new JTable();
		table.setBounds(282, 202, 0, 0);
		f.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(147, 347, 1, 1);
		f.getContentPane().add(table_1);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("green.png");
				f.getContentPane().add(img);
				img.setIcon(icon);
				//f.setVisible(true);
			}
		});

		f.setVisible(true);
	}
}