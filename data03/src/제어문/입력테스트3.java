package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 입력테스트3 {

	public static void main(String[] args) {
		// 랜덤한 int값을 발생시켜야함.
		// 램덤한 값 발생시킬 수 있는 Random 클래스 필요
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num = r.nextInt(100); // 0~99
		int target = num;
		int count = 0; //시도횟수
		
		while (true) {
			//count++; //증감연산자, count = count + 1;
			System.out.print("당신이 생각하는 숫자는(종료 -1)>> ");
			int think = sc.nextInt();
			if (think == -1) {
				System.out.println("시스템 종료");
				break;
				//System.exit(0);
			}
			count++;
			if (target == think) {
				System.out.println("시도한 횟수는 " + count + "회.");
				System.out.println("실패한 횟수는 " + (count -1) + "회");
				System.out.println("정답입니다. 축하드립니다.");
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("틀렸습니다.");
				// 힌트를 주세요.!
				// 정답보다 생각한 값이 높으면 너무 높아요!
				// 정답보다 생각한 값이 낮으면 너무 낮아요!
				if (target < think) {
					System.out.println("너무 높아요!");
				} else {
					System.out.println("너무 낮아요!");
				} //else 
			}//else

		}//while
		sc.close();
	}//main
}//class





