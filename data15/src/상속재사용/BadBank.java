package 상속재사용;

public class BadBank extends Bank{
	
	//alicia@naver.com //at(~에)
	
	@Override  //표시(Annotation, 어노테이션), 생략가능
	public double getInterestsRate() {
		return 10;
	}
	
}
