package db;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class AllWindow3 {
	static JPanel panel;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(700, 503);
		
		JButton btnNewButton = new JButton("전체목록가지고오기");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.all();
				System.out.println("목록의 개수는 " + list.size());
				//for (int i = 0; i < 10; i++) {
					JPanel p = new JPanel();
					p.setLayout(null);
					p.setBackground(Color.yellow);
					
					JButton b = new JButton("나야.");
					b.setBounds(100, 100, 100, 100);
					p.add(b);
					
					JButton b2 = new JButton("나도");
					b2.setBounds(200, 200, 100, 100);
					p.add(b2);
					
					JButton b3 = new JButton("나도 나도");
					b3.setBounds(300, 300, 100, 100);
					p.add(b3);
					
					panel.add(p);
				//}
				f.setVisible(true);
			}
		});
		
		panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		
		f.setVisible(true);
	}

}
