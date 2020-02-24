package 제어문;

public class IfTest1 {

	public static void main(String[] args) {
		//if
		//if~else
		//if~else if(조건)~else
		int jumsu = 77;
		if (jumsu >= 90) {
			System.out.println("A");
		}else if (jumsu >= 80) {
			System.out.println("B");
		}else if (jumsu >= 70) {
			System.out.println("C");
		}else if (jumsu >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
