package 부품만들기;

public class 강아지사용 {

	public static void main(String[] args) {
		강아지 dog = new 강아지();
		dog.name = "까돌이";
		dog.age = 11;
		dog.gender = '남';
		//강아지의 모든 특징을 프린트!!
		
		System.out.println("강아지 이름은 " + dog.name);
		dog.bark(10, "마당", "왈왈");
		dog.eat("뼈다귀");
		dog.wave("심하게", 30);
	}

}
