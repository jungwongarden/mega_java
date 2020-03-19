package db;

import java.util.ArrayList;

public class AllMain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.all();
		System.out.println("목록의 개수는 " + list.size());		
		for (int i = 0; i < list.size(); i++) {
			//각 하나씩은 dto
			System.out.println(list.get(i)); 
		}
		
		System.out.println("======================");
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
			System.out.println(dto.getTel());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
