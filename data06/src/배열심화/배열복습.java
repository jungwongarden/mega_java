package 배열심화;

import javax.swing.JOptionPane;

public class 배열복습 {

	public static void main(String[] args) {
		//1. 내가 배열에 들어갈 값들을 처음부터 알고 있는 경우
		String[] names = {"홍길동","박길동","송길동"};
		
		//2. 내가 배열에 들어갈 값들을 나중에 넣어주는 경우
		String[] subject = new String[3]; //3=>개수
		//subject, length, subject[0], subject[1], subject[2]
				
		//배열에 값들을 입력받아서 집어 넣는 코드 
		for (int i = 0; i < subject.length; i++) {
			subject[i] =  JOptionPane.showInputDialog("과목입력");
		}
		
		//배열에 넣었던 값들을 프린트
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		for (String s : subject) {
			System.out.println(s);
		}
		
				
				
		
		
		
		
		
		
	}

}
