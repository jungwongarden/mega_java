package 변수로전달;

public class 변수 {
	//메소드 오버로딩(다형성)
	//하나의 이름으로 오버해서 불러 쓰고 있다.
	//하나의 이름으로 입력값이 다양한 형태를 쓰고 있다.
	public void call() {
		//System.out.println("call 메소드 호출됨.");
		String hobby = "달리기";
		String company = "mega";
		//return hobby, company; //파이썬에 있음
		//리턴을 할때는 변수들을 하나씩 보낼 수 없다.
		//무조건 하나로 묶어주어야 한다.
	
	}
	
	public void call(String name, int age) {
		System.out.println("전달 받음. 이름은 " + name);
		System.out.println("전달 받음. 나이는 " + age);
	}
	
	public String call2() {
		return "ok";
	}
}
