package 부품만들기;

public class 사람 {
//	사람을 만들어봅시다.!
//	-----------------------
//	- 특징을 알아야 한다.
//	- 모델링: 설계하는 과정(디자인)
//		- 동작, 동적인 특징) 
//			음식을 먹다. 말을 한다. 도구를 사용한다.
//			=> 메소드 
//		- 성질, 정적인 특징) 이름, 나이, 성별 => 변수
//		=> 특징 = 특성 = property, attribute, item
	
	//멤버변수 => 전역변수, 자동 초기화
	String name; //null
	int age; //0
	char gender; 
	
	//멤버메소드
	public void eat() {
		System.out.println("음식을 먹다.");
	}
	
	public void talk() {
		System.out.println("말을 한다.");
	}
	
	public void tool() {
		System.out.println("도구를 사용한다.");
	}
	
	
	
	
	
	
	
	
	
	
}
