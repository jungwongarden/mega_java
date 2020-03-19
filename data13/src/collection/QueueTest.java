package collection;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("그저께 우유");
		milk.add("어제 우유");
		milk.add("오늘 우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}
}
