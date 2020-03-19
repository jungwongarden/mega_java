package 스레드;

public class ErrorTest4 {

	public void call() throws Exception{
		//Error! --> Exception!
		int x = 100;
		
		int y = x / 0;
		
		System.out.println(x);
	}

}
