package 스레드;

import javax.swing.JOptionPane;

//ctrl+f11 : 
//complie(javac Error2.java)--->Error2.class
//							--->run(java Error2)
public class ErrorTest3 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3};
		
		//에러가 발생한 경우, 이 에러가 발생한 메소드내에서
		//에러가 발생했을 때 처리할 내용을 바로 넣어서 처리.
		try {
			num[3] = 4;  //runtime error
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("에러발생");
		} finally {
			System.out.println("에러가 발생하지 않아도 꼭 실행시키고 싶은 부분..");
			//파일 close시키는 부분.
			//db관련된 객체 close부분.
		}
		
		System.out.println(num[0]);
	}
}


