package 클래스만들기;

import java.util.Scanner;

public class 카페 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문 개수: "); //5000
		int coffee = sc.nextInt();
		System.out.print("와플 주문 개수: "); //5000
		int waffle = sc.nextInt();
		int count = cal.add(coffee, waffle);
		int sum = cal.mul(count);
		
		//vip인 경우, 할인해주어야 함.
		System.out.print("당신은 vip인가요? 예)1, 아니요)2");
		String vip = sc.next();
		if (vip.equals("1")) {
			//vip인경우
			//금액이 4만원 이상이면 5천원 할인
			if (sum >= 40000) {
				System.out.println("vip님의 지불 금액은 " + (sum - 5000) + "원");
			} else {
				System.out.println("vip님의 지불 금액은 " + sum + "원");
			}
		} else { //vip가 아닌 경우
			System.out.println("회원님의 지불 금액은 " + sum + "원");
		}
		sc.close();
	}
}
