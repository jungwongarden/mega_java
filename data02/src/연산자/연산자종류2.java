package 연산자;

import javax.swing.JOptionPane;

public class 연산자종류2 {

	public static void main(String[] args) {
		//총가격을 입력받으세요.
		String price = JOptionPane.showInputDialog("총가격");
		int price2 = Integer.parseInt(price);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//총인원수를 입력받으세요.
		System.out.println(price2);
		//한 명당 얼마씩 내야하는가?(소수점)
	}

}
