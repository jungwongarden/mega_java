package 배열심화;

import java.util.Random;

public class 랜덤배열 {

	public static void main(String[] args) {
		//랜덤하게 값을 1000개 시켜서,
		Random r = new Random(42); //참조형 변수, 지역변수
		//seed값(씨앗값)
		//1000개의 데이터를 저장할 수 있는 공간 필요 
		//=>배열(array)
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000); //0~999
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + ": " + numbers[i]);
		}
		
		//최대값이 무엇인지 찾아보고,
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i]; 
			}
		}
		System.out.println("최대값은 " + max);
		
		//위치가 어디인지 찾아보고,
		//max값이 어디에 있는지 찾아봅시다.!
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max == numbers[i]) {
				System.out.println(max + "값의 위치는 " + i);
				count++;
			}
		}
		
		//몇 개나 있는지 찾아봅시다.
		System.out.println(max + "값의 개수는 " + count + "개");
	}

}
