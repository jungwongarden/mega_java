package 상속재사용;

public final class SuperMan extends Man{ //상속불가능한 클래스
	//성질(3), 동작(3)
	
	String cloth;
	
	public void fly() {
		System.out.println("하늘을 날다.");
	}

	@Override
	public String toString() {
		return "SuperMan [cloth=" + cloth + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
}
