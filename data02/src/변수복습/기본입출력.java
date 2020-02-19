package 변수복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 당신이 좋아하는 음식은?
		// 입력을 받을 때는 무조건 String으로 인식한다.
		String name = JOptionPane.showInputDialog("당신이 좋아하는 음식은?");

		// 당신이 좋아하는 음식은 짜장면이군요!
		System.out.println("당신이 좋아하는 음식은 " + name + "이군요!");
		
		//Scanner sc = new Scanner(System.in);
		
		String age = JOptionPane.showInputDialog("나이를 입력?");
		//String -> int처리
		//100(o), aaa(x)
		int age2 = Integer.parseInt(age); //"100"->100
		
		System.out.println("내년의 내 나이는 " + (age2 + 1) + "세");
	}
}





