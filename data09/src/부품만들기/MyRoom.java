package 부품만들기;

public class MyRoom {
	
	public static void main(String[] args) {
		Tv myTv = new Tv();
		System.out.println(myTv);
		//Tv클래스를 복사(new)
		//new는 멤버변수가 복사!!!됨.
		
		myTv.channel  = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		System.out.println(myTv);
		
		Tv yourTv = new Tv();
		yourTv.channel  = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		myTv.turnOn();
		yourTv.turnOff();	
		
	}

}
