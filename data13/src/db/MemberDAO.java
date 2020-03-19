package db;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class MemberDAO {
	String url = "jdbc:mysql://localhost:3708/virus";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//5.전체 검색을 할 예정. 
		public ArrayList<MemberDTO> all() {
			ArrayList<MemberDTO> list = new ArrayList<>();
			try {
				//1) 커넥터 설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. 커넥터 설정 ok..");
				
				//2) db연결
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db연결 ok..");
				
				//3) sql문 결정
				String sql = "select * from member";
				ps = con.prepareStatement(sql);
				System.out.println("3. sql문 결정 ok..");
				
				//4) sql문 전송
				rs = ps.executeQuery();
				System.out.println("4. sql문 전송 ok..");
				
				
				while(rs.next()) { //검색 결과가 있는지 체크해주는 메서드
					//row의 위치를 나타내는 커서를 아래로 옮기면서
					//그 해당 row가 있는지 체크해주는 메소드
					//있으면 true, 없으면 false!
					System.out.println("검색 결과가 있어요.!!");
					MemberDTO dto2 = new MemberDTO();
					String id = rs.getString("id");
					String pw = rs.getString(2);
					String name = rs.getString(3);
					String tel = rs.getString(4);
					dto2.setId(id);
					dto2.setPw(pw);
					dto2.setName(name);
					dto2.setTel(tel);
					list.add(dto2);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				con.close();
				ps.close();
				rs.close();
			}
			return list;
		}
	
		//4.검색을 할 예정. 
		public MemberDTO select(MemberDTO dto) {
//			System.out.println(dto.getCode());
			MemberDTO dto2 = null;			
			try {
				//1) 커넥터 설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. 커넥터 설정 ok..");
				
				//2) db연결
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db연결 ok..");
				
				//3) sql문 결정
				String sql = "select * from member where id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				System.out.println("3. sql문 결정 ok..");
				
				//4) sql문 전송
				ResultSet rs = ps.executeQuery();
				System.out.println("4. sql문 전송 ok..");
				
				if(rs.next()) { //검색 결과가 있는지 체크해주는 메서드
					System.out.println("검색 결과가 있어요.!!");
					dto2 = new MemberDTO();
					String id = rs.getString(1);
					String pw = rs.getString(2);
					String name = rs.getString(3);
					String tel = rs.getString(4);
					dto2.setId(id);
					dto2.setPw(pw);
					dto2.setName(name);
					dto2.setTel(tel);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dto2;
		}
		
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

			
			//4) sql문 전송
			ps.executeUpdate();
			System.out.println("4. sql문 전송 ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//1. 회원가입
	public void insert(MemberDTO dto) {
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
			
			String sql = "insert into member(id, pw, name, tel) values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			
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
//	public int add(int x, int y) {
//		return x + y;
//	}
	public int delete(MemberDTO dto) {
		System.out.println("회원탈퇴 처리하다.");
		int result = 0; //회원탈퇴가 안된 경우.
		try {
			//1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok..");
			
			//2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok..");
			
			//3) sql문 결정
			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			
			System.out.println("3. sql문 결정 ok..");
			
			//4) sql문 전송
			result = ps.executeUpdate();
			System.out.println("삭제 요청 결과는 " + result);
			System.out.println("4. sql문 전송 ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("test");
		return result;
	}
	
	
	
	
	
}
