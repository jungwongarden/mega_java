package 이차원배열;

public class 이차원배열1 {

	public static void main(String[] args) {
		//값을 미리 알고 있는가 모르고 있는가?
		int[][] seat = new int[3][10]; //3행 10열(30개의 저장공간)
		//30개의 저장공간에 모두 0으로 초기화되어 있는 상태
		//배열은 자동 초기화를 시켜준다. int->0, 참조형->null
		System.out.println(seat[0][9]);
		seat[0][9] = 100;
		System.out.println(seat[0][9]);
		seat[0][6] = 200;
		System.out.println(seat[0][6]);
		seat[1][8] = 300;
		System.out.println(seat[1][8]);
		seat[2][3] = 400;
		System.out.println(seat[2][3]);
		System.out.println(seat.length); //행
		//행마다 열의 개수가 달라질 수 있다.
		//열의 개수를 구할 때는 행마다 각각 구해주어야 한다.
		//2차원 배열은 1차원 배열을 여러개 가진 것임.
		//각 행은 1차원 배열이다.
		//1차원인 각 행은 배열의 크기가 다를 수 있다.
		System.out.println(seat[0].length);
		System.out.println(seat[1].length);
		System.out.println(seat[2].length);
		
//		int[][] seat2 = new int[3][];
//		int[] a = new int[10]; 
//		int[] b = new int[8];
//		int[] c = new int[2];
//		seat2[0] = a;
//		seat2[1] = b;
//		seat2[2] = c;
		
		
		
		
		
		
		
		
	}
}






