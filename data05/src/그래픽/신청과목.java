package 그래픽;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 신청과목 {

	static int java, jsp, spring;

	public static void main(String[] args) {
		String[] subject = new String[3];

		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("과목 입력");
		}
		JFrame f = new JFrame();
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		for (int i = 0; i < subject.length; i++) {
			JButton b = new JButton(subject[i]);
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String choice = b.getText();
					if (choice.equals("자바")) {
						java++;
					} else if (choice.equals("jsp")) {
						jsp++;
					} else {
						spring++;
					}
					f.setTitle("java: " + java + ", " + "jsp: " + jsp + ", " + "spring: " + spring);
				}
			});

		}

		f.setVisible(true);

	}

}
