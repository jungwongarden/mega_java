package 제어문;

import java.util.Scanner;

public class SwitchTest6 {

	public static void main(String[] args) {
		//입력 클래스 필요
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력받아봅시다");
		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		int num2 = sc.nextInt();
		System.out.print("연산자: ");
		String oper = sc.next(); //char, String을 입력
		System.out.println("----------------");
		
		switch (oper) {
		case "+":
			System.out.println("두 수의 합은 " + (num1 + num2));
			break;
		case "-":
			System.out.println("두 수의 차는 " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱은 " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은 " + (num1 / num2));
			break;
		default:
			System.out.println("연산자 오류 입니다.");
			break;
		}
		
		
		
		
		
	}

}
