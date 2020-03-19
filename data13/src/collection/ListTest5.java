package collection;

import java.util.ArrayList;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDTO dto = new MemberDTO();
		dto.setId("park");
		dto.setPw("park");
		dto.setName("park");
		dto.setTel("011");
		list.add(dto);
		
		MemberDTO dto2 = new MemberDTO();
		dto2.setId("park2");
		dto2.setPw("park2");
		dto2.setName("park2");
		dto2.setTel("0112");
		list.add(dto2);
		
		//System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
	}

}
