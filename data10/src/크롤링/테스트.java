package 크롤링;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 테스트 {
	static int i, flag;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(1300, 698);
		f.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(25, 93, 1300, 485);
		f.getContentPane().add(panel);

		JButton btnNewButton = new JButton("패널에 버튼추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				
				for (i = 0; i < 3; i++) {
					JButton b = new JButton();
					ImageIcon icon = new ImageIcon(i + ".jpg");
					b.setIcon(icon);
					b.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println(b.getIcon());
							b.setEnabled(false);
							flag = 1; 
							새창 새 = new 새창();
							새.window();
							//f.dispose();
						}
					});
					panel.add(b);
					panel.revalidate();
					panel.repaint();
					panel.setVisible(true);
				}

			}
		});
		btnNewButton.setBounds(40, 33, 163, 50);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("패널사라짐");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				panel.removeAll();
//				panel.revalidate();
//				panel.repaint();
				panel.setVisible(false);
			}
		});
		button.setBounds(236, 33, 126, 50);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("패널다시보임");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
			}
		});
		button_1.setBounds(410, 33, 133, 50);
		f.getContentPane().add(button_1);

		f.setVisible(true);
	}
}
