package 제어문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 입력테스트2 {

	public static void main(String[] args) {
		//1. 입력받는 클래스 필요
		//ctrl + shift + o(영문) : 자동import
		Scanner sc = new Scanner(System.in);
		
		 while (true) {
			System.out.print("입력(종료:x)>> ");
			String data = sc.next();
			//값을 비교하는 경우 비교연산자는 기본데이터타입만 쓸 수있다.
			//기본 데이터 타입: 정수, 실수, 문자, 논리(boolean)
			if (data.equals("x")) { //true/false
				JOptionPane.showMessageDialog(null, "시스템종료합니다.");
				break; //break를 포함하고 있는 반복문을 끝내줌.
			}
			System.out.println("당신의 입력 데이터는 " + data);
		}
		//2. 콘솔에 프린트
		 sc.close();
	}
}





