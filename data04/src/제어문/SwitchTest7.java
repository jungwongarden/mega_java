package 제어문;

import java.util.Scanner;

public class SwitchTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호: ");
		String cn = sc.next(); 
		char data = cn.charAt(0); //A100  B200  C300
		
		System.out.println("----------------");
		
		switch (data) {
		case 'A':
			System.out.println(data + "는 기획부");
			break;
		case 'B':
			System.out.println(data + "총무부");
			break;
		case 'C':
			System.out.println(data + "인사부");
			break;
		default:
			System.out.println(data + "없는 부서 입니다.");
			break;
		}
	}

}
