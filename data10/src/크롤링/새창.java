package 크롤링;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 새창 {

	public void window() { //ctrl+](닫는 괄호 찾기)
		JFrame name = new JFrame();
		name.setSize(500, 500);
		JButton b = new JButton("나를 눌러요.");
		name.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		name.setVisible(true);
	}

}
