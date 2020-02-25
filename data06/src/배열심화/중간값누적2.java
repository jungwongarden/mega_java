package 배열심화;

import java.util.ArrayList;

public class 중간값누적2 {

	public static void main(String[] args) {
		//1~100까지의 수 중에서 짝수를 구해서 배열에 넣어봅시다.
		ArrayList even = new ArrayList();
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //%는 나머지 연산자.
				even.add(i);
			}
		}
		System.out.println(even);
		System.out.println(even.size());
	}
}
