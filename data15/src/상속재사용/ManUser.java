package 상속재사용;

public class ManUser {

	public static void main(String[] args) {
		Man p = new Man();
		p.power = 1000;
		p.name = "신";
		p.age = 32;
		
		System.out.println(p);
		
		p.talk();
		p.think();
		p.wild();
		
	}
}
