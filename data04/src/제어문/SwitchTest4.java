package 제어문;

import java.util.Date;

public class SwitchTest4 {

	public static void main(String[] args) {
		char c = 'A';
		
		switch (c) {
		case 'A':
			System.out.println("최우수!"); break;
		case 'B':
			System.out.println("우수!"); break;
		default:
			System.out.println("보통");
		}
	}
}
