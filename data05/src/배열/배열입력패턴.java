package 배열;

import java.util.Scanner;

public class 배열입력패턴 {

	public static void main(String[] args) {
//		1.다음과 같이 입력하여 출력되도록!
//		과목: java
//		과목: jsp
//		과목: spring
//		------------
//		java보다는 spring!!

		Scanner sc = new Scanner(System.in);
		String[] subject = new String[3];
		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목: ");
			String data = sc.next();
			subject[i] = data;
		}
		System.out.println(subject[0] + "보다는 " + subject[2]);
		
		//위치를 알고 싶으면 index를 확인!
		//배열 전체중에서 무엇인가를 찾거나, 조건에 
		//만족하는 것을 처리해야 하는 경우
		//for문을 돌려야 한다.!
		for (int i = 0; i < subject.length; i++) { 
			if(subject[i].equals("jsp")) {
				System.out.println("index: " + i);
			}
		}
		
//		2. 입력하여 계산후 출력
//		입력: 100
//		입력: 200
//		입력: 300
//		-----------
//		첫번째값과 마지막값의 합은 400
	}

}
