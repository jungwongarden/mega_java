package 제어문;

import javax.swing.JOptionPane;

public class 조건문04 {

	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("id");
		String p = JOptionPane.showInputDialog("pw");
		int id = Integer.parseInt(i);
		int pw = Integer.parseInt(p);
		
		if (id == 1111 && pw == 2222) {
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}
	}
}
