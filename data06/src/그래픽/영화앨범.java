package ±×·¡ÇÈ;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ¿µÈ­¾Ù¹ü {
	private static JTextField t1;
	private static JTextField t2;
	static int start = 5; //Ã³À½¿¡ ½ÇÇàÇßÀ» ¶§ º¸¿©Áú ÀÎµ¦½º
	
	public static void main(String[] args) {
		String[] movies = {"1.jpg","2.jpg","3.jpg", "4.jpg", "5.jpg",
							"6.jpg","7.jpg","8.jpg", "9.jpg", "10.jpg"
							}; 
		String[] names = {"1.jpg","2.jpg","3.jpg", "4.jpg", "5.jpg",
				"6.jpg","7.jpg","8.jpg", "9.jpg", "10.jpg"
				}; 
		
		JFrame f = new JFrame();
		f.setTitle("\uC601\uD654\uC568\uBC94");
		f.setSize(636, 470);
		JButton img = new JButton("");
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start == 0) {
					start = 9;
				} else {
					start--; 
				}
				t1.setText(names[start]);
				ImageIcon icon = new ImageIcon(movies[start]);
				img.setIcon(icon);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setText(names[start]);
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("±¼¸²", Font.BOLD, 60));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setFont(new Font("±¼¸²", Font.BOLD, 60));
		f.getContentPane().add(t2, BorderLayout.SOUTH);
		t2.setColumns(10);
		
		
		ImageIcon icon = new ImageIcon(movies[start]);
		img.setIcon(icon);
		
		img.setFont(new Font("±¼¸²", Font.BOLD, 60));
		f.getContentPane().add(img, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
