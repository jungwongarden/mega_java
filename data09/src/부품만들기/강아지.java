package 부품만들기;

import javax.swing.JOptionPane;

public class 강아지 {

//강아지 => 클래스
	//부류(class)
//------
//멤버변수: 이름, 나이, 성별 
	String name;
	int age;
	char gender;
	
//멤버메소드: 먹다, 짖다, 꼬리를 흔들다
	public void eat(String food) {
		System.out.println(food + "를 먹다.");
	}
	public void bark(int min, String location, String how) {
		System.out.println(min + "분 동안 " + location + "에서 " + how);
	}
	public void wave(String how, int time) {
		//매개변수, parameter, 지역변수
		System.out.println(how + " 꼬리를 " + time + "분 흔들다.");
	}
}
