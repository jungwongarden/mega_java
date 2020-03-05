package 부품만들기;

public class Tv {
//	Tv =>class
//	--------
	
//	정적인 특징 => 멤버변수
	int channel; //채널번호
	boolean onOff; //켜져있는지 여부
	int volume; //소리크기
	
//  동적인 특징 => 멤버메소드
//	turnOn(), turnOff() => 메소드를 만들다.(메소드 정의)
//	메소드를 정의했다고 해서 혼자 실행되지 않는다.
//	메소드는 호출(사용)해야만 실행된다.
	
	public void turnOn() {
		System.out.println("Tv를 켜다.");
	}
	
	public void turnOff() {
		System.out.println("Tv를 끄다. ");
	}

	@Override
	public String toString() {
		return "결과값 프린트 [채널=" + channel + ", tv전원=" + onOff + ", 소리크기=" + volume + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
