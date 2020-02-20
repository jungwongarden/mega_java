package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임2 {

	public static void main(String[] args) {
//		가위 바위 보 게임: 1회만 게임함.
//		0: 가위, 1: 바위, 2: 보
//		-------------
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int comWin = 0; // 컴 이김
		int meWin = 0; // 나 이김
		int draw = 0; // 비김

		while (true) {
			int computer = r.nextInt(3); // 0,1,2
			// System.out.println("컴퓨터: " + computer);
			System.out.print("내가 냄(0: 가위, 1: 바위, 2: 보, -1: 종료)>> ");
			int me = sc.nextInt(); // 입력
			if (me == -1) {
				System.out.println("가위바위보게임 종료.");
				System.out.println("-------------");
				System.out.println("나의 이긴 횟수: " + meWin + "회");
				System.out.println("컴의 이긴 횟수: " + comWin + "회");
				System.out.println("비긴 횟수: " + draw + "회");
				int sum = meWin + comWin;
				double result = (double) meWin / sum * 100;
				System.out.println("나의 승률: " + (int) result + "%");
				break;
			}

			// System.out.println("나: " + me);
			if (me == 0) {
				System.out.println("내가 가위를 냄");
				if (computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("비김");
					draw++;
				}
				if (computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("컴퓨터 승");
					comWin++;
				}
				if (computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("나 승");
					meWin++;
				}
			}
			if (me == 1) {
				System.out.println("내가 바위를 냄");
				if (computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("나 승");
					meWin++;
				}
				if (computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("비김");
					draw++;
				}
				if (computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("컴퓨터 승");
					comWin++;
				}
			}
			if (me == 2) {
				System.out.println("내가 보를 냄");
				if (computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("컴퓨터 승");
					comWin++;
				}
				if (computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("나 승");
					meWin++;
				}
				if (computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("비김");
					draw++;
				}
			}
		}
		sc.close();
	}

}
