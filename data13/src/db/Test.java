package db;

public class Test {

	public static void main(String[] args) {
		char[] data = {'a', 'b', 'c'};
		String result = data.toString(); //abc
		System.out.println(result);
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId("park");
		MemberDTO dto2 = dao.select(dto); //abc@dsldkslfskf
		
	}

}
