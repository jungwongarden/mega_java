package db연결;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

	public static void main(String[] args) {
		
		Date date = new Date();
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JLabel label = new JLabel();
		label.setText(date + "");
		f.add(label);
		f.setVisible(true);
		
	}

}
