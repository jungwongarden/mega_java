package 생성자;

public class Tv {
	String color; //null
	int size; //0
	
	//default(기본 생성자)
	//파라메터있는 생성자가 없는 경우는 자동으로 만들어줌.
	//파라메터있는 생성자가 있는 경우는 자동으로 만들어주지 않음.
	public Tv() {
	}
	
	//파라메터 생성자: 객체 생성시 자동 호출되는 메소드
	//                 멤버변수 초기화
	public Tv(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	//Tv로 생성된 객체의 멤버변수 값 프린트
	@Override
	public String toString() {
		return "Tv [color=" + color + ", size=" + size + "]";
	}

	


}
