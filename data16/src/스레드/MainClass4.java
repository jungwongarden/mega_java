package 스레드;

public class MainClass4 {

	
	public static void main(String[] args) {
		ErrorTest4 e4 = new ErrorTest4();
		try {
			e4.call();
		} catch (Exception e) {
			System.out.println("우아한 처리");
		} //호출
		System.out.println("다음 코드...");
	}
}
