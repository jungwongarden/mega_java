package 상속재사용;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan s = new SuperMan();
		s.cloth = "빨강"; //superman
		s.power = 100; //man
		s.name = "클라크"; //person
		s.age = 300; //person
		
		System.out.println(s);
		
		s.fly(); //superman
		s.wild(); //man
		s.talk(); //person
		s.think(); //person
	}
}






