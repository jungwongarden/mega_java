package 정적;

public class Mask {
	//인스턴스 변수
	String color;
	int price;
	int count; 
	static int total; //마스크 객체 생성 개수
	//Mask.total
	static final String COMPANY = "웰킵스"; //상수
	
	public int getCount() {
		return count; //인스턴스변수는 객체 생성후, 주소로만 접근 가능
	}
	
	//set/get
	public static int getTotal() {
		return total; 
		//static메소드를 사용하는 경우,
		//멤버변수는 static변수여야 한다.
		//객체 생성과 상관없이 접근하는 메소드와 
		//멤버변수를 사용해야 함.
	}
	
	public Mask() {
	}
	
	//전체 멤버변수 값 입력
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
		total++; //만들어진 마스크 개수를 세어보자.!
	}

	//전체 멤버변수 값 출력
	@Override
	public String toString() {
		return "색=" + color + ", 가격=" + price + ", 수량=" + count;
	}
}







