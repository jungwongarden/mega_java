package 상속재사용;

public class High extends Student{
	//부모로부터 상속받은 것 들 중에 좀더 specific한 것으로 
	//만들고 싶은 것이 있으면 덮어써라!
	//override(오버라이드, 재정의)
	public void study() {
		System.out.println("미적분 공부하다.");
	}
}
