package 배열;

import java.util.Scanner;

public class 배열에서찾기 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 9, 7 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고자 하는 수는 : ");
		int target = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				System.out.println(target + "이(가) 있는 위치는 : " + i );
			}
		}
		sc.close();
	}
}
