package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void signIn() { //회원가입 창 뜨게 하기
		 JFrame f = new JFrame();
		 f.getContentPane().setBackground(Color.GREEN);
		 f.setSize(500, 500);
		 f.getContentPane().setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("아이디");
		 lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		 lblNewLabel.setBounds(29, 32, 132, 49);
		 f.getContentPane().add(lblNewLabel);
		 
		 t1 = new JTextField();
		 t1.setBackground(Color.YELLOW);
		 t1.setFont(new Font("굴림", Font.BOLD, 30));
		 t1.setBounds(184, 32, 248, 49);
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
		 t2.setBounds(184, 101, 248, 49);
		 f.getContentPane().add(t2);
		 
		 JLabel label_1 = new JLabel("이름");
		 label_1.setFont(new Font("굴림", Font.BOLD, 30));
		 label_1.setBounds(29, 176, 132, 49);
		 f.getContentPane().add(label_1);
		 
		 t3 = new JTextField();
		 t3.setFont(new Font("굴림", Font.BOLD, 30));
		 t3.setColumns(10);
		 t3.setBackground(Color.YELLOW);
		 t3.setBounds(184, 176, 248, 49);
		 f.getContentPane().add(t3);
		 
		 JLabel label_2 = new JLabel("전화번호");
		 label_2.setFont(new Font("굴림", Font.BOLD, 30));
		 label_2.setBounds(29, 249, 132, 49);
		 f.getContentPane().add(label_2);
		 
		 t4 = new JTextField();
		 t4.setFont(new Font("굴림", Font.BOLD, 30));
		 t4.setColumns(10);
		 t4.setBackground(Color.YELLOW);
		 t4.setBounds(184, 249, 248, 49);
		 f.getContentPane().add(t4);
		 
		 JButton btnNewButton = new JButton("회원가입처리");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String id = t1.getText();
		 		String pw = t2.getText();
		 		String name = t3.getText();
		 		String tel = t4.getText();
		 		
		 		DB처리 db = new DB처리();
		 		db.insert(id, pw, name, tel);
		 		//db.insert("melon","melon","melon","melon");
		 	}
		 });
		 btnNewButton.setBackground(Color.RED);
		 btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		 btnNewButton.setBounds(29, 337, 403, 85);
		 f.getContentPane().add(btnNewButton);
		 f.setVisible(true);
	}
}
