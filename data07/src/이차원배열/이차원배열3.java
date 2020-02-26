package 이차원배열;

public class 이차원배열3 {

	public static void main(String[] args) {
		int[][] seat = new int[3][];
		int[] a = new int[10];
		int[] b = new int[8];
		int[] c = new int[6];
		seat[0]= a;
		seat[1]= b;
		seat[2]= c;
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
