package 배열심화;

import java.util.Scanner;

public class 최대값찾기2 {

	public static void main(String[] args) {
		//1. 저장공간 필요
		int[] num = new int[5];
		
		//2. 5번 입력을 받아서 배열에 넣는다.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력>> ");
			num[i] = sc.nextInt();
		}
		sc.close();
		
		//해당 인덱스까지의 최대값을 저장해두기 위해
		//임시변수 (max)
		int max = num[0]; 
		
		
		//배열을 순회하면서 최대값 찾기
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);
		
		
		
	}

}
