package 배열심화;

public class 중간값누적 {

	public static void main(String[] args) {
		//1~100까지의 수 중에서 짝수를 구해서 배열에 넣어봅시다.
		int[] even = new int[50]; //0~49
		
		int index = 0; //짝수 배열에 해당하는 인덱스
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //%는 나머지 연산자.
				even[index] = i;
				index++;
			}
		}
		for (int i : even) {
			System.out.println(i);
		}
	}
}
