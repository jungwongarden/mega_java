package collection;

import java.util.ArrayList;

public class ListTest4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박길동");
		list.add("정길동");
		String name = list.get(0);
		System.out.println(name);
		
		
	}

}
