package 상속재사용;

public class Man extends Person{
	//성질(2), 동작(2)
	int power;
	
	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	public void wild() {
		System.out.println("거칠다.");
	}
}
