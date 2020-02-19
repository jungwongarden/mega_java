package 변수;

public class 기본형 {
	static String name;
	//age = 200;
	
	public static void main(String[] args) {
		//기본형 데이터 - 해당 타입의 값이 들어가는 데이터
		//숫자
			//정수: int
			//실수: double
		//문자(한글자): char
		//논리(bool): boolean(true/false)
		
		//선언!!!=>  데이터타입 변수명!
		//램에 공간이 만들어진다.(공간을 할당)
		
		int age = 100; //정수(-21억~21억)
		double eye = 0.7; //실수 
		char gender = '남';
		boolean food = true; //예약어는 이름으로 사용될 수 없다.
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 시력은 " + eye);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나는 점심을 먹었을까요? " + food);
		
		name = "홍길동";
		System.out.println("나의 이름은 " + name);
		
		
		
		
		
		
		
		
		
	}

}
