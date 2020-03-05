package 부품만들기;

public class 사람사용{
	public static void main(String[] args) {
		사람 p1 = new 사람();
		p1.name = "홍길동";
		p1.age = 100;
		p1.gender = '남';
		
		p1.talk();
		p1.tool();
		p1.eat();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		
		
	}
}