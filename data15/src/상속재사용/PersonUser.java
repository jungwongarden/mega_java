package 상속재사용;

//모든 클래스는 Object을 상속받은 것!
public class PersonUser{

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "은정";
		p.age = 20;
		
		System.out.println(p);
		
		p.talk();
		p.think();
	}
}





