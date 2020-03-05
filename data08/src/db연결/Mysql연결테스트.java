package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Mysql연결테스트 {

	public static void main(String[] args) {
//		DB프로그래밍 절차(Java DB Connectivity, JDBC)
//		------------------
//		1) Connector(class) 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!");
			
			String url = "jdbc:mysql://localhost:3708/virus";
			String user = "root";
			String password = "1234";
			//String name = JOptionPane.showInputDialog("이름");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공!");
			
			String sql = "insert into member values ('win','win','win','win')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 결정 성공!");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			
		} catch (Exception e) {
			System.out.println("문제 발생!!");
		}
		
		
//		2) DB연결(db명, user, password)
//		3) sql문 결정(insert)
//		4) sql문 전송
	}

}
