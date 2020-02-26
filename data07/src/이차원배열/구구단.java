package 이차원배열;

public class 구구단 {

	public static void main(String[] args) {
		//2~9단까지 8번 반복
		for (int i = 2; i < 10; i++) {
			//한 단이 for문 하나
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " +  j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
