package 변수복습;

public class 기본형변수 {

	public static void main(String[] args) {
		// 주석, comment, 설명
		// 컨트롤 + /(자동주석 설정, 해제)
		/*
		 * 여러줄 주석!
		 */
		System.out.println("모니터에 출력..");
		//기본형 4가지 - 정수, 실수, 문자, 논리
		//자바는 변수를 할당할 때 데이터가 들어가는 타입과 크기를 결정
		//변수앞에 타입에 해당하는 키워드를 써준다.
		//byte(1바이트 -128~127)->int(4바이트 +-21억)->long(8바이트)
		//long money = 22L; 
		int num; //선언!=> 공간을 할당! 
				//쓰레기값이 들어있는 상태
				//초기화하지 않은 상태
		num = 0;
		
		//float weight = 45.5f;
		double height = 185.5; 
		
		char level = 'A'; //2바이트, 문자 한 글자
		
		//자동완성(컨트롤 + 스페이스바)
		boolean coffee = true; //false
		
		
		//기본형은 아닌데 너무 많이 쓰므로, 기본형처럼 간단히 쓸 수 있게 만들어 놓음.
		//문자열(String) => 쌍따옴표(")
		String name = "홍길동";
		
		System.out.println("-------------------");
		System.out.println("내가 좋아하는 숫자는 " + num);
		System.out.println("내 키는 " + height);
		System.out.println("내 등급은 " + level);
		System.out.println("커피를 마셨는지 여부 " + coffee);
		System.out.println("내 이름은 " + name);
		
		//컨트롤 + f11(실행, run, runtime)
		
	}
}
