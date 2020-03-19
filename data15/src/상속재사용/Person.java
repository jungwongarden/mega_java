package 상속재사용;

public class Person { //사람
	//성질, 동작
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void talk() {
		System.out.println("말을 하다.");
	}
	
	public void think() {
		System.out.println("생각하다.");
	}
	
}
