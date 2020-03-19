package 스레드;

public class ForTest1 extends Thread {

	@Override //오버라이딩: 상속을 받은 것 중에 기능을 재정의 
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("더하기 연산: " + i);
		}
	}
}
