package 클래스만들기;

public class 계산기사용 {
	
public static void main(String[] args) {
		업그레이드계산기 cal = new 업그레이드계산기();
		
		//호출한 메소드가 void가 들어갔다면, 프린트 불가.
		//return이 있는 경우만 프린트 가능.
		System.out.println(cal.add(100, 200)); //값을 전달
		System.out.println(cal.add(100, 22.1));
		System.out.println(cal.add(11.1, 22.1));
		System.out.println(cal.add("길동", "홍"));
		System.out.println(cal.add("메가", 1));
		int[] jumsu = cal.add(); //주소
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
	}
}
