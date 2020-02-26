package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 그래픽활용 {

	public static void main(String[] args) {
		Object[] title = {1,2,3};
		Object[][] content = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JTable table = new JTable(content, title);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
		
		
	}

}
