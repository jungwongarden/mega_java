package 제어문;

import javax.swing.JOptionPane;

public class 조건문05 {

	public static void main(String[] args) {
//		오늘의 날씨는 1)비 2)흐림 3)눈 4)화창
//		1이나 3이면 지하철을 타고 간다.(or -> ||)
//		나머지는 버스를 타고 간다.
		String choice = JOptionPane.showInputDialog("오늘의 날씨는 1)비 2)흐림 3)눈 4)화창");
		int choice2 = Integer.parseInt(choice);
		if (choice2 == 1 || choice2 == 3) {
			JOptionPane.showMessageDialog(null, "지하철타고 가자");
		} else if(choice2 == 2) {
			JOptionPane.showMessageDialog(null, "버스타고 가자");
		} else {
			JOptionPane.showMessageDialog(null, "걸어 가자");
		}
	}
}




