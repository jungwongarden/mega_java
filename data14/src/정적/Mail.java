package 정적;

import javax.swing.JOptionPane;

public class Mail {

	public void mail() {
		JOptionPane.showMessageDialog(null, "메일 : " + LoginCheck.logId + "님 환영합니다.");
	}
}
