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
import javax.swing.border.LineBorder;

public class AllWindow2 {
	private static JTable table;
	private static JScrollPane scrollPane; 

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
				Object[] title = {"아이디", "패스워드", "이름", "전화번호"};
				Object[][] contents = new Object[list.size()][];
				for (int i = 0; i < list.size(); i++) {
					MemberDTO dto = list.get(i);
					Object[] row = new Object[4];
					row[0] = dto.getId();
					row[1] = dto.getPw();
					row[2] = dto.getName();
					row[3] = dto.getTel();
					contents[i] = row;
				}
				table = new JTable(contents, title);	
				table.setBorder(new LineBorder(Color.RED, 4));
				table.setFont(new Font("굴림", Font.BOLD, 25));
				table.setRowHeight(100);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		
		f.setVisible(true);
	}

}
