package collection;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("짜장면");
		list.add("우동");
		list.add("라면");
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.size()); //개수
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
	}
}

