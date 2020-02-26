package 이차원배열;

public class 이차원배열4 {

	public static void main(String[] args) {
		//String[] names = {"홍길동", "박길동"};
		
		String[][] names708 = {
				{"호재", "지헌", "영혜"},
				{"소연", "상혁", "재성", "재영"},
				{"신", "상도", "승종"}
		};
		
		for (int i = 0; i < names708.length; i++) {
			for (int j = 0; j < names708[i].length; j++) {
				System.out.print(names708[i][j] + " ");
			}
			System.out.println();
		}
	}
}
