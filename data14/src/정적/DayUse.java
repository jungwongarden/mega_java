package 정적;

public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		int count = Day.count;
		System.out.println(count + "일");
		
		int sum = Day.sum;
		System.out.println("전체 하는 일의 시간: " + sum + "시간");
		System.out.println("평균 일의 시간: " + sum/count + "시간");
		
	}

}
