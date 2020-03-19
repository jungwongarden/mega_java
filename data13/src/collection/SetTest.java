package collection;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		//set(집합) : 중복을 허용지 않는 데이터의 모음.
		HashSet bag = new HashSet();
		bag.add("책");
		bag.add("볼펜");
		bag.add(5000);
		bag.add("커피");
		bag.add("책"); //안들어감.
		System.out.println(bag);	
	}
}







