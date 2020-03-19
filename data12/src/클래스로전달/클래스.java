package 클래스로전달;

public class 클래스 {
	
	public void call(Bag c) { //c<- 100
		
		//4.가방에서 꺼냄.
		System.out.println(c.getId());
		System.out.println(c.getPw());
		System.out.println(c.getName());
		System.out.println(c.getAge());
	}
}



