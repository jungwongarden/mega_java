package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가입창 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	
	public static void main(String[] args) {
		 JFrame f = new JFrame();
		 f.getContentPane().setBackground(Color.GREEN);
		 f.setSize(573, 490);
		 f.getContentPane().setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("아이디");
		 lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		 lblNewLabel.setBounds(29, 32, 132, 49);
		 f.getContentPane().add(lblNewLabel);
		 
		 t1 = new JTextField();
		 t1.setBackground(Color.YELLOW);
		 t1.setFont(new Font("굴림", Font.BOLD, 30));
		 t1.setBounds(184, 32, 329, 49);
		 f.getContentPane().add(t1);
		 t1.setColumns(10);
		 
		 JLabel label = new JLabel("패스워드");
		 label.setFont(new Font("굴림", Font.BOLD, 30));
		 label.setBounds(29, 101, 132, 49);
		 f.getContentPane().add(label);
		 
		 t2 = new JTextField();
		 t2.setFont(new Font("굴림", Font.BOLD, 30));
		 t2.setColumns(10);
		 t2.setBackground(Color.YELLOW);
		 t2.setBounds(184, 101, 329, 49);
		 f.getContentPane().add(t2);
		 
		 JLabel label_1 = new JLabel("이름");
		 label_1.setFont(new Font("굴림", Font.BOLD, 30));
		 label_1.setBounds(29, 176, 132, 49);
		 f.getContentPane().add(label_1);
		 
		 t3 = new JTextField();
		 t3.setFont(new Font("굴림", Font.BOLD, 30));
		 t3.setColumns(10);
		 t3.setBackground(Color.YELLOW);
		 t3.setBounds(184, 176, 329, 49);
		 f.getContentPane().add(t3);
		 
		 JLabel label_2 = new JLabel("전화번호");
		 label_2.setFont(new Font("굴림", Font.BOLD, 30));
		 label_2.setBounds(29, 249, 132, 49);
		 f.getContentPane().add(label_2);
		 
		 t4 = new JTextField();
		 t4.setFont(new Font("굴림", Font.BOLD, 30));
		 t4.setColumns(10);
		 t4.setBackground(Color.YELLOW);
		 t4.setBounds(184, 249, 329, 49);
		 f.getContentPane().add(t4);
		 
		 JButton btnNewButton = new JButton("가입");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id = t1.getText();
		 		String pw = t2.getText();
		 		String name = t3.getText();
		 		String tel = t4.getText();
		 		
		 		//1.가방을 만들자.
		 		MemberDTO dto = new MemberDTO();
		 		
		 		//2.가방에 넣자.
		 		dto.setId(id);
		 		dto.setPw(pw);
		 		dto.setName(name);
		 		dto.setTel(tel);
		 		
		 		//3.전달
		 		//4.가방에 꺼내자.
		 		MemberDAO db = new MemberDAO();
		 		db.insert(dto);
		 	}
		 });
		 btnNewButton.setBackground(Color.RED);
		 btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		 btnNewButton.setBounds(24, 337, 124, 85);
		 f.getContentPane().add(btnNewButton);
		 
		 JButton button = new JButton("검색");
		 button.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id = t1.getText();
		 		//가방을 만들고,
		 		MemberDTO dto = new MemberDTO();
		 		//가방에 넣음.
		 		dto.setId(id);
		 		
		 		//db처리 부품 복사해서 가지고 왔음.
		 		MemberDAO dao = new MemberDAO();
		 		
		 		//select기능 선택해서 호출.
		 		MemberDTO dto2 = dao.select(dto);
		 		//int data = sc.nextInt(); 
		 		
		 		System.out.println(dto2);
		 		
		 		//null일 가능성 체크
		 		if(dto2 != null) {
		 			t1.setText(dto2.getId());
		 			t2.setText(dto2.getPw());
		 			t3.setText(dto2.getName());
		 			t4.setText(dto2.getTel());
		 			t1.setForeground(Color.red);
		 			t2.setForeground(Color.red);
		 			t3.setForeground(Color.red);
		 			t4.setForeground(Color.red);
		 		}else {
					JOptionPane.showMessageDialog(null, "해당 회원이 없습니다.");
				}
		 	}
		 });
		 button.setFont(new Font("굴림", Font.BOLD, 35));
		 button.setBackground(Color.RED);
		 button.setBounds(160, 337, 124, 85);
		 f.getContentPane().add(button);
		 
		 JButton button_1 = new JButton("수정");
		 button_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id = t1.getText();
		 		String pw = t2.getText();
		 		String name = t3.getText();
		 		String tel = t4.getText();
		 		MemberDTO dto = new MemberDTO();
		 		dto.setId(id);
		 		dto.setPw(pw);
		 		dto.setName(name);
		 		dto.setTel(tel);
		 		
		 		MemberDAO dao = new MemberDAO();
		 		dao.update();
		 	}
		 });
		 button_1.setFont(new Font("굴림", Font.BOLD, 35));
		 button_1.setBackground(Color.RED);
		 button_1.setBounds(296, 337, 117, 85);
		 f.getContentPane().add(button_1);
		 
		 JButton button_2 = new JButton("탈퇴");
		 button_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id = t1.getText();
		 		MemberDTO dto = new MemberDTO();
		 		dto.setId(id);
		 		
		 		MemberDAO dao = new MemberDAO();
		 		int result = dao.delete(dto);
		 		if(result  == 0) {
		 			JOptionPane.showMessageDialog(null, "탈퇴가 되지 않았습니다.");
		 		}else {
		 			JOptionPane.showMessageDialog(null, "탈퇴에 성공했습니다.");
		 		}
		 	}
		 });
		 button_2.setFont(new Font("굴림", Font.BOLD, 40));
		 button_2.setBackground(Color.RED);
		 button_2.setBounds(425, 337, 120, 85);
		 f.getContentPane().add(button_2);
		 f.setVisible(true);
	}
}
