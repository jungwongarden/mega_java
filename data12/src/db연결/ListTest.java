package db연결;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("메인윈도우");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setSize(350, 200);

		String[] colorNames = { "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
				"Orange", "Pink", "Red", "White", "Yellow" };

		JList colorJList = new JList(colorNames);
		colorJList.setVisibleRowCount(5);
		f.add(new JScrollPane(colorJList));

		colorJList.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(colorJList.getSelectedValue());
			}
		});
		
		
//		String value = "abc100 (song)";
//		int index = value.indexOf("(");
//		String pre = value.substring(0, index - 1);
//		System.out.println(pre);
//		System.out.println(pre.length());

		f.setVisible(true);

	}

}
