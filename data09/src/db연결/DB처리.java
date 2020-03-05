package db연결;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class DB처리 {
	String url = "jdbc:mysql://localhost:3708/virus";
	String user = "root";
	String password = "1234";
	
	public void update() {
		System.out.println("회원수정 처리하다.");
		try {
			//1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok..");
			
			//2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok..");
			
			//3) sql문 결정
			String id = JOptionPane.showInputDialog("삽입할 id입력");
			String tel = JOptionPane.showInputDialog("삽입할 tel입력");
			
			String sql = "update member set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			
			System.out.println("3. sql문 결정 ok..");
			
			//4) sql문 전송
			ps.executeUpdate();
			System.out.println("4. sql문 전송 ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//1. 회원가입
	public void insert(String id, String pw, String name, String tel) {
		//매개변수(파라메터, parameter), 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			//1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok..");
			
			//2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok..");
			
			//3) sql문 결정
//			String id = JOptionPane.showInputDialog("삽입할 id입력");
//			String pw = JOptionPane.showInputDialog("삽입할 pw입력");
//			String name = JOptionPane.showInputDialog("삽입할 name입력");
//			String tel = JOptionPane.showInputDialog("삽입할 tel입력");
			
			String sql = "insert into member values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			System.out.println("3. sql문 결정 ok..");
			
			//4) sql문 전송
			ps.executeUpdate();
			System.out.println("4. sql문 전송 ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//2. db연결
	public void connect() {
		System.out.println("DB연결 처리하다.");
		try {
			//1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok..");
			
			//2) db연결
			DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok..");
			
			//3) sql문 결정
			//4) sql문 전송
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//3. 회원탈퇴
	public void delete() {
		System.out.println("회원탈퇴 처리하다.");
		try {
			//1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok..");
			
			//2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok..");
			
			//connect();
			String id = JOptionPane.showInputDialog("삭제하고 싶은 id입력");
			//3) sql문 결정
			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			System.out.println("3. sql문 결정 ok..");
			
			//4) sql문 전송
			ps.executeUpdate();
			System.out.println("4. sql문 전송 ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
