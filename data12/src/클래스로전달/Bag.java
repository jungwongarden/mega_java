package 클래스로전달;

//여러개의 데이터를 한번에 묶어서 전송하려고!
//Data Transfer Object(DTO, VO: Value Object)

public class Bag {
	public String id;
	public String pw;
	public String name;
	public int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
