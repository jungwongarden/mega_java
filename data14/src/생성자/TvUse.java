package 생성자;

import javax.swing.JOptionPane;

public class TvUse {

	public static void main(String[] args) {
		Tv myTv = new Tv("빨강", 50);
		Tv yourTv = new Tv();
		//Tv()는 default이지만, 파라메터 생성자가 미리 있는 경우는
		//명시적으로 만들어주어야 한다.
		
		//a.java---> A.java
		
		String result = String.valueOf(100);
		
		String color = JOptionPane.showInputDialog("TV색 입력");
		String size = JOptionPane.showInputDialog("TV사이즈 입력");
		int size2 = Integer.parseInt(size);
		yourTv.color = color;
		yourTv.size = size2;
		
		//객체 생성자 각 객체에 맞는 인스턴스를 넣기 위해
		//힙 영역에 객체별로 따로 복사되는 멤버변수
		//인스턴스 변수(<->static, 정적변수)
//		myTv.color = "빨강";
//		myTv.size = 50;
		System.out.println(myTv); //toString()
		System.out.println(yourTv); //toString()
	}
}
