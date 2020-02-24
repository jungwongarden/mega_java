package 제어문;

public class SwitchTest1 {

	public static void main(String[] args) {
		String food = "라면";

		switch (food) {
			case "짜장":
				System.out.println("중국집으로!!"); 
				break;
			case "우동":
				System.out.println("일식집으로!!");
				break;
			case "라면":
				System.out.println("분식집으로!!");
				break;
			default:
				System.out.println("집에서!!");
		}
	}
}
