package 클래스만들기;

public class 값전달사용 {

	public static void main(String[] args) {
		값전달 move = new 값전달();
		int value = 100;
		move.add(value); //값 전달 
		int[] refer = {100, 99, 88};
		move.add(refer); //주소 전달
	}

}
