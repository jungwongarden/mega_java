package collection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//arraylist를 사용해봅시다.
		
		//배열보다 좋은 점: 
		//1)크기 조정 가능, 2)아무 타입이나 넣을 수 있음
		
		//배열과 동일한 점:
		//1)인덱스가 있다, 2)많은 데이터를 묶을 때 사용한다.
		
		ArrayList list = new ArrayList();
		list.add("홍길동"); //String
		list.add(100); //int
		list.add(11.22); //double
		list.add(true); //boolean
		list.add('A'); //char
		list.set(4, null); //값 update!
		System.out.println(list);
	}
}





