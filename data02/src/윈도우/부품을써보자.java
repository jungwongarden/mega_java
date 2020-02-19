package 윈도우;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품을써보자 {

	public static void main(String[] args) {
		//날짜, 시간 구하는 것.
		Date d1 = new Date();
		int hour = d1.getHours(); //deprecated
		System.out.print(hour + "시 ");
		int min = d1.getMinutes();
		System.out.print(min + "분 ");
		int sec = d1.getSeconds();
		System.out.println(sec + "초 ");
		
		int year = d1.getYear();
		System.out.println("올해는 " + (year + 1900) + "년");
		
		int month = d1.getMonth();
		System.out.println("이번 달은 " + (month + 1) + "월");
		
		int date = d1.getDate();
		System.out.println("오늘은 " + date + "일");
		
		int day = d1.getDay();
		System.out.println("오늘은 " + day + "요일");
		//0: 일~ 6:토
		
		//랜덤
		Random r = new Random(42); //seed값
		int num = r.nextInt(46); //0~45
		System.out.println(num);
		
		//int count = 0;		
		//콘솔에서 입력해서 자동으로 타입을 바꾸어주는 기능
		Scanner sc = new Scanner(System.in); //키보드 콘솔에서 입력
		System.out.print("이름을 입력>> ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("나이를 입력>> ");
		int age = sc.nextInt(); //String-->int변환
		System.out.println("내년 나이는 " + (age + 1));
		sc.close();
	}
}
