package 배열;

import java.util.Scanner;

public class 극장예매시스템 {
	static int count; //이 클래스내에 전체 영역에서 사용 가능
							//전역변수(global, 글로벌 변수)
							//전역변수는 자동 초기화
	
	public static void main(String[] args) {
		int[] seat = new int[10];

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			System.out.print("예매하고 싶은 좌석 번호(종료: -1)>> ");
			int choice = sc.nextInt();
			//choice는 지역변수(local, 로컬변수)
			//선언된 위치가 중요.!
			//지역변수는 자동초기화 안됨.
			//지역변수는 초기화를 프로그래머가 해주어야 함.
			//choice를 포함하고 있는 중간괄호({ })내에서만 사용 가능
			if (choice == -1) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("예매 인원: " + count + "명");
				System.out.println("예매 금액: " + (count * 10000) + "원");
				break; //while break;
			}
			if (seat[choice - 1] == 1) {
				System.out.println("예매가 불가능합니다.");
				System.out.println("다른 좌석을 선택해주세요.");
			} else {
				System.out.println("예매를 진행합니다.");
				seat[choice - 1] = 1;
				count++; //증감연산자
			} 
		}
		
		
		
		
	}
}
