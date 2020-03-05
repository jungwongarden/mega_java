package 클래스만들기;

public class 배열입력 {

	//argv: 매개변수(parameter, 인자)
	//변수안에 들어가는 값, 주소: (argument, 인수)
	public static void main(String[] argv) { //참조형 주소
		for (String x : argv) {
			System.out.println(x);
		}
	}
}
