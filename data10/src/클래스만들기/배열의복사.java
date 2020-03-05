package 클래스만들기;

import java.util.Arrays;

public class 배열의복사 {

	public static void main(String[] args) {
		int a = 100;
		int b = a; //변수의 복사
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a = 200;
		System.out.println("------");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		int[] x = {1, 2, 3, 4, 5};
		int[] y = x; //배열의 복사(얕은 복사)
		
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------");
		
		x[0] = 9;
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println();
		int[] z = x.clone(); //깊은 복사
		
		x[0] = 8;
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i : z) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("x의 주소: " + x);
		System.out.println("y의 주소: " + y);
		System.out.println("z의 주소: " + z);
		
	}
}
