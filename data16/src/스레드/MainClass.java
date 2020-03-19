package 스레드;

public class MainClass {

	public static void main(String[] args) {
		ForTest1 f1 = new ForTest1();
		ForTest2 f2 = new ForTest2();
		
		f1.start(); //cpu에 thread를 등록
		f2.start(); 		
	}
}
