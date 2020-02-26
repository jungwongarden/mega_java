package 이차원배열;

public class 별100개찍기 {

	public static void main(String[] args) {
		//10번 반복해보자.
		for (int i = 0; i < 10; i++) {
			//for문 하나당 별 10개씩 한줄
			for (int j = 0; j < 10; j++) {
				System.out.print("★" + " ");
			}
			System.out.println();
		}
	}
}
