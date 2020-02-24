package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽테스트 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		
		JButton b = new JButton("나를 눌러.");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		f.getContentPane().add(b);
		
		f.setVisible(true);
	}

}
