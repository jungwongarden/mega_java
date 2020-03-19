package db;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AllWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
		
		JButton btnNewButton = new JButton("전체목록가지고오기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.all();
				System.out.println("목록의 개수는 " + list.size());		
				for (int i = 0; i < list.size(); i++) {
					MemberDTO dto = list.get(i);
					textArea.append(dto.getId() + " " +
									dto.getPw() + " " + 
									dto.getName() + " " +
									dto.getTel() + "\n");
									
				}
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		textArea.setColumns(20);
		textArea.setRows(10);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		f.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		f.setVisible(true);
	}

}
