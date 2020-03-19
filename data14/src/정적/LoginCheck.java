package 정적;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginCheck extends JFrame {

	static String logId;
	static LoginCheck check;

	public static void main(String[] args) {
		check = new LoginCheck();
	}

	public LoginCheck() {
		
		setSize(200, 200);
		String saveId = "root";
		String savePw = "1234";

		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");

		JButton b = new JButton("로그인 체크");
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (saveId.equals(id) && savePw.equals(pw)) {
					JOptionPane.showMessageDialog(check, "로그인 되었습니다.");
					logId = id; // 원하는 곳에서 id를 사용할 수 있도록 static으로 지정!
					News n = new News();
					n.news();

					Mail m = new Mail();
					m.mail();

				} else {
					JOptionPane.showMessageDialog(null, "로그인이 되지 않았습니다.");
				}
			}
		});
		
		setVisible(true);
	}
}
