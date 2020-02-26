package 이차원배열;

import java.util.Scanner;

public class 극장예매2차원 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		Scanner sc = new Scanner(System.in);
		int count = 0; //지역변수
		while (true) {
			System.out.println("극장 예매 시스템입니다.");
			System.out.println("-------------------------");
			System.out.print("   ");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + ": ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("-------------------------");
			System.out.print("예매를 진행하시겠습니까? 종료x>> ");
			String data = sc.next();
			if (data.equals("x")) {
				System.out.println("시스템 종료합니다.");
				System.out.println("결제금액은 " + (count * 10000)  + "원");
				System.exit(0);
			}
			System.out.print("예매 행(0~2): ");
			int row = sc.nextInt();
			System.out.print("예매 열(0~9): ");
			int col = sc.nextInt();
			//이미 예매된 자리인지 체크
			if (seat[row][col] == 1) {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 좌석을 선택해주세요.");
			} else {
				count++;
				seat[row][col] = 1;
				System.out.println("예매처리 완료");
			}
		}
		
		
	}

}
