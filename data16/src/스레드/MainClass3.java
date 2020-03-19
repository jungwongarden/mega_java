package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

public class MainClass3 extends JFrame {
	JLabel counter, img, time;//전역변수
	
	public MainClass3() {
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setLayout(null);

		counter = new JLabel("count: 100");
		counter.setForeground(Color.RED);
		counter.setFont(new Font("Dialog", Font.BOLD, 35));
		counter.setBounds(41, 22, 285, 63);
		getContentPane().add(counter);

		img = new JLabel(new ImageIcon("car1.png"));
		img.setFont(new Font("Dialog", Font.BOLD, 35));
		img.setBounds(218, 95, 249, 188);
		getContentPane().add(img);

		time = new JLabel("시간");
		time.setForeground(Color.BLUE);
		time.setFont(new Font("Dialog", Font.BOLD, 35));
		time.setBounds(30, 355, 694, 63);
		getContentPane().add(time);
		setTitle("스레드");
		setSize(770, 479);

		Count c = new Count();
		Time t = new Time();
		Image i = new Image();
		c.start();
		t.start();
		i.start();

		setVisible(true);
	}

	// 내부 클래스(inner class)
	// 독립적으로 객체생성 불가.
	// 외부클래스의 있는 멤버변수를 공유할 목적으로 사용됨.
	public class Count extends Thread {
		@Override
		public void run() {
			for (int i = 100; i >= 0; i--) {
				// 외부자원 연결
				try {
					Thread.sleep(1000); // 1초
				} catch (Exception e) {
				}
				counter.setText("count: " + i);
				//count가 다 되었을 때 프로그램 종료
				if(i == 0) System.exit(0);
			}
		}
	}

	public class Time extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(1000); // 1초
				} catch (Exception e) {
				}
				//Date date = new Date();
				Calendar cal = Calendar.getInstance();
				time.setText(cal.getTime() + "");
			}
		}
	}
	
	public class Image extends Thread {
		@Override
		public void run() {
			String[] list = {"car1.png", "car2.png", "car3.png", "car4.png", "car5.png"}; 
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000); // 1초
				} catch (Exception e) {
				}
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				if(i == 4) {
					i = -1;
				}
			}
		}
	}

	//객체 생성하지 않아도 호출되는 메소드!
	public static void main(String[] args) {
		MainClass3 m3 = new MainClass3();
	}
}
