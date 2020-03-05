package 클래스만들기;

public class 계산기 {
	//사칙연산
	public int mul(int count) {
		//매개변수, 지역변수, 값을 전달(call by value)
		System.out.println("곱하기 처리");
		int price = 5000;
		int sum = price * count;
		//System.out.println("당신이 지불할 금액 총액은 " + sum + "원");
		return sum;
	}
	
	//void: 없다! 리턴이 없다.
	public int add(int coffee, int waffle) {
		System.out.println("더하기 처리");
		int count = coffee + waffle;
		System.out.println("총 주문개수: " + count + "개");
		return count;
	}
}
