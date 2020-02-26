package 이차원배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		seat[0][0] = 100;
		seat[2][9] = 900;
		seat[1][0] = 200;
		System.out.println(seat[0].length);
		System.out.println(seat[1].length);
		System.out.println(seat[2].length);
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
