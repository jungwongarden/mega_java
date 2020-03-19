package db;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLayout(null);
		
		JPanel p2 = new JPanel();
		
		GridBagLayout grid = new GridBagLayout();
		p2.setLayout(grid);
		GridBagConstraints gc = new GridBagConstraints();
		grid.setConstraints(p2, gc);
		
		for (int i = 0; i < 100; i++) {
			JButton b = new JButton(i+"");
			b.setFont(new Font("궁서", Font.BOLD, 70));
			
			gc.fill = GridBagConstraints.HORIZONTAL;
			gc.weightx = 0.1;
			gc.gridx = i;
			gc.gridy = 0;
			p2.add(b, gc);

			
//			gc.fill = GridBagConstraints.HORIZONTAL;
//			gc.weightx = 0.2;
//			gc.gridx = ++i;
//			gc.gridy = ++i;
//			p2.add(b2, gc);
//			
//			gc.fill = GridBagConstraints.HORIZONTAL;
//			gc.weightx = 0.3;
//			gc.gridx = ++i + ++i ;
//			gc.gridy = ++i + ++i ;
//			p2.add(b3, gc);
			
		}
		p2.setBackground(Color.yellow);
		
		JScrollPane s2 = new JScrollPane(p2);
		s2.setBounds(500, 100, 300, 400);
		f.add(s2);
		f.setVisible(true);
		
	}
}
