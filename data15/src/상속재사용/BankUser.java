package 상속재사용;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BankUser {

	public static void main(String[] args) {
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		GoodBank good = new GoodBank();
		System.out.println("badBank rates: " + bad.getInterestsRate());
		System.out.println("normalBank rates: " + normal.getInterestsRate());
		System.out.println("goodBank rates: " + good.getInterestsRate());
		
		
		JFrame f = new JFrame();
		JButton b= new JButton("버튼");
		JLabel l = new JLabel("라벨");
		f.add(b);
		f.add(l);
		
//		Component가 부모(큰)
//		JLabel, JButton이 자식들(작)
//		=>부모 자리에 자식들 다 들어갈 수 있다.
		
		
		
		
		
		
		
	}

}
