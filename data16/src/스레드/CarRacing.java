package 스레드;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CarRacing extends JFrame {

	public CarRacing() {
		setTitle("자동차 경주");
		setSize(1400, 600);
		setLayout(null);
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "환영합니다.");
			
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "기다려주세요..");
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "다시 돌아오셨군요.");				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "잠깐 저는 뒤로...");
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "안녕");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		
		Car car1 = new Car("car01.png", 100, 0);
		Car car2 = new Car("car02.png", 100, 150);
		Car car3 = new Car("car03.png", 100, 300);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	
	public class Car extends Thread{
		int x, y;
		JLabel label;
		
		//생성자, constructor
		public Car(String file, int x, int y) {
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel(icon);
			this.x = x;
			this.y = y;
			label.setBounds(x, y, 150, 150);
			add(label);
		}
		
		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); //0~49
				x = x + move;
				label.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		CarRacing r = new CarRacing();
		
	}
}
