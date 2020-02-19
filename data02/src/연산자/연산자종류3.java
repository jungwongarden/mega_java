package 연산자;

import javax.swing.JOptionPane;

public class 연산자종류3 {

	public static void main(String[] args) {
		//총가격을 입력받으세요.
		String price = JOptionPane.showInputDialog("총가격");
		int price2 = Integer.parseInt(price);
		
		//반복문: 초기값, 조건식, 증감식
		//0~9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("여기가 끝!");
	}
}






