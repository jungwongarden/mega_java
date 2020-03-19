package 배열로전달;

public class 배열 {
//	public int add(int x, int y) {
//		return x + y;
//	}
//	public double add(double x, int y) {
//		return x + y;
//	}
	
	public void call(String[] list) {
		System.out.println("첫번째 값은 " + list[0]);
		System.out.println("두번째 값은 " + list[1]);
	}
	
	//메소드 오버로딩(다형성)
	//하나의 이름으로 오버해서 불러 쓰고 있다.
	//하나의 이름으로 입력값이 다양한 형태를 쓰고 있다.
	public String[] call() {
		String hobby = "달리기";
		String company = "mega";
		//return hobby, company; //파이썬에 있음
		//리턴을 할때는 변수들을 하나씩 보낼 수 없다.
		//무조건 하나로 묶어주어야 한다.
		String[] array = {hobby, company};
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
