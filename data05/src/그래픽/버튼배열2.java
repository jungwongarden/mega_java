package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼배열2 {
	static int i;
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1100, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		for (int i = 0; i < 300; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(b.getText().equals("예약")) {
						f.setTitle("예약불가");
					}else {
						count++; //예약한 인원 카운트
						f.setTitle(count + "명 예약함.");
						b.setText("예약");//버튼 위에 글자 올려줌.
						b.setEnabled(false); //버튼의 기능을 변경불가능으로 설정
						b.setBackground(Color.red);//버튼 배경 색
						b.setForeground(Color.yellow);//버튼 글자 색
						System.out.println(b.getText() + "버튼을 눌렀음.");
					}
				}
			});
		}

		f.setVisible(true);
	}
}
