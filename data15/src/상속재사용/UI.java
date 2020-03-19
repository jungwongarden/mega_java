package 상속재사용;

import javax.swing.JFrame;

public class UI extends JFrame {
	//jframe의 것 다 상속받음.
	
	//기본 생성자, new할 때 자동으로 호출되는 메소드
	public UI() {
		setTitle("나는 상속받은 프레임");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		UI u = new UI();
		UI u2 = new UI();
	}
}
