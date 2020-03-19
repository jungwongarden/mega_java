package 스레드;

import javax.swing.JOptionPane;

//ctrl+f11 : 
//complie(javac Error2.java)--->Error2.class
//							--->run(java Error2)
public class ErrorTest2 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3};
		
		try {
			num[3] = 4;  //runtime error
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "에러 발생함, 확인요청!");
//			e.printStackTrace();
		}
		
		System.out.println(num[0]);
	}
}


