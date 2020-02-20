package 제어문;

import java.util.Scanner;

public class 입력테스트 {
	
	public static void main(String[] args) {
		
		//입력용 부품(class)을 복사해옵시다.
		Scanner sc = new Scanner(System.in);
		//오늘의 날씨는? 화창 입력!
		System.out.print("오늘의 날씨는? ");
		String weather = sc.next();
		System.out.println("아하! " + weather + "하군요!");
		
		//몇도 인가요? 1
		System.out.print("몇도 인가요? ");
		int temp = sc.nextInt(); //String->int
		
		if (temp >= 0) {
			System.out.println("봄이 왔어요!!");
		} else {
			System.out.println("봄이 안왔어요!!");
		}
		sc.close();
	}
}
