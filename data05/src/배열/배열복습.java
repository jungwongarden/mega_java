package 배열;

public class 배열복습 {

	public static void main(String[] args) {
		// 100개의 영화데이터가 필요.
		String[] names = new String[100]; // String 변수의 개수
		// 배열의 자동 초기화 int ->0, double ->0.0
		// String ->null
		System.out.println(names); // 참조형 변수 주소값
		System.out.println(names.length); // 개수가 들어있는 읽기 전용 변수
		System.out.println(names[0]); // index는 0부터 시작
		names[0] = "기생충"; // 첫번째
		System.out.println(names[0]);
		names[names.length - 1] = "1917"; // 마지막
		for (int i = 0; i < names.length; i++) { //i는 index
			System.out.println(i + ": " + names[i]);
		}
		//foreach(each = 하나씩!)
		for (String n : names) {
			System.out.println(n);
		}
		
		int[] customers = new int[100];
		customers[0] = 1000;
		customers[99] = 500;
		
		for (int i = 0; i < customers.length; i++) { //index
			System.out.println(i + ": " + customers[i]);
		}
		
		for (int c : customers) { //integer
			System.out.println(c);
		}
	}
}







