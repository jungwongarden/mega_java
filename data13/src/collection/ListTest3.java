package collection;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("김연아"); //1등
		list.add("송연아");
		list.add("정연아");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등: " + list.get(i));
		}
		list.remove(1);
		System.out.println(list);
		list.set(1, "정연우");
		System.out.println(list);
		list.add(1, "박연아");
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

