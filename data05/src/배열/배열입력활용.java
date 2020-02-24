package 배열;

import java.util.Scanner;

public class 배열입력활용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력>> ");
			num[i] = sc.nextInt(); //10 20 30 40 50
		}
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
	}
}




