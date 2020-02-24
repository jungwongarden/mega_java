package 제어문;


public class SwitchTest5 {

	public static void main(String[] args) {
		String sn = "901010-2055511";
		char gender = sn.charAt(7);
		switch (gender) {
		case '1': case '3':
			System.out.println("남");
			break;
		default:
			System.out.println("여");
			break;
		}
		
	}
}
