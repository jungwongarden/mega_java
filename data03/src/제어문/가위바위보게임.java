package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
//		가위 바위 보 게임: 1회만 게임함.
//		0: 가위, 1: 바위, 2: 보
//		-------------
//		1. 컴퓨터가 랜덤하게 내야함.(0~2)
		Random	r = new Random();
		int computer = r.nextInt(3); //0,1,2
		//r.nextInt() -21~21 발생!
		//r.nextInt(숫자) 0~숫자-1 발생! 범위를 줄일 수 있다.
		System.out.println("컴퓨터: " + computer);
		
//		2. 입력을 받아 내가 내야함.(0~2)
		Scanner sc = new Scanner(System.in);
		System.out.print("내가 냄(0: 가위, 1: 바위, 2: 보)>> ");
		int me = sc.nextInt();
		System.out.println("나: " + me);
		
		
//		3. 내가 낸거 확인
//		if(me == 0)
//			if(com == 0) 비김
//			if(com == 1) 컴퓨터 승
//			if(com == 2) 내가 승
//		if(me == 1)
//		if(me == 2)
		
		if (me == 0) {
			System.out.println("내가 가위를 냄");
			if (computer == 0) {
				System.out.println("컴퓨터가 가위를 냄");
				System.out.println("비김");
			}
			if (computer == 1) {
				System.out.println("컴퓨터가 바위를 냄");
				System.out.println("컴퓨터 승");
			}
			if (computer == 2) {
				System.out.println("컴퓨터가 보를 냄");
				System.out.println("나 승");
			}
		}
		if (me == 1) {
			System.out.println("내가 바위를 냄");
			if (computer == 0) {
				System.out.println("컴퓨터가 가위를 냄");
				System.out.println("나 승");
			}
			if (computer == 1) {
				System.out.println("컴퓨터가 바위를 냄");
				System.out.println("비김");
			}
			if (computer == 2) {
				System.out.println("컴퓨터가 보를 냄");
				System.out.println("컴퓨터 승");
			}
		}
		if (me == 2) {
			System.out.println("내가 보를 냄");
			if (computer == 0) {
				System.out.println("컴퓨터가 가위를 냄");
				System.out.println("컴퓨터 승");
			}
			if (computer == 1) {
				System.out.println("컴퓨터가 바위를 냄");
				System.out.println("나 승");
			}
			if (computer == 2) {
				System.out.println("컴퓨터가 보를 냄");
				System.out.println("비김");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
