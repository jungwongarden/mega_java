package 변수로전달;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import 배열로전달.배열;
import 클래스로전달.Bag;
import 클래스로전달.클래스;

public class Main {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(505, 456);
		f.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnZ = new JButton("변수로전달");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "홍길동";
				int age = 100;
				변수 var = new 변수();
				//메소드 이름은 똑같은 이름으로 여러개 만들 수 있다.
				//구분은 입력값으로 한다.
				//메소드 호출할 때는 입력되는 데이터의 타입, 순서, 개수를
				//체크한다. 동일한 경우만 호출!
				var.call(name, age);
				String result = var.call2();
				JOptionPane.showMessageDialog(null, "받은 결과값" + result);
			}
		});
		btnZ.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(btnZ);
		
		JButton button = new JButton("배열로전달");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//자동import
				//ctrl+shift+o
				배열 ar = new 배열();
				String[] result = ar.call(); //100
				JOptionPane.showMessageDialog(null, "취미는 " + result[0]);
				JOptionPane.showMessageDialog(null, "회사는 " + result[1]);
				
				String[] list = {"달리기", "자전거 타기"};
				ar.call(list);				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("클래스로전달");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.가방을 만들고, DTO
				Bag c = new Bag(); //c<- 100
				
				//2.가방에 넣고,
				c.setId("hong");
				c.setPw("hong");
				//c.setName("홍길동");
				c.setAge(100);
				
				클래스 클 = new 클래스();
				//3.가방을 이동
				클.call(c);
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("컬렉션으로전달");
		button_2.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(button_2);
		f.setVisible(true);
	}
}
