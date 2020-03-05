package 클래스만들기;

public class 값전달 {
	public void add(int x) { //값 전달
		//call-by-value(콜바이벨류)
		System.out.println("전달 받음 " + x);
	}
	
	public void add(int[] x) { //주소 전달
		//call-by-reference(콜바이레퍼런스)
		System.out.println("전달 받음");
		for (int a : x) {
			System.out.println(a);
		}
	}
}
