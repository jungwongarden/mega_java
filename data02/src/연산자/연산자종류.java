package 연산자;

public class 연산자종류 {

	public static void main(String[] args) {
		//연산자 종류
		//1. 대입: =
		//2. 결합: + (타입이 달라도 결합 가능)
		//3. 산술: + - *(에스테리크) /(슬러시) %(나머지)
		//4. 비교: == != >= 
		//5. 논리: 조건이 여러개인 경우, 
			//&&(엔퍼센트, and연산자), ||(버티컬바, or연산자)  
			//!(not 연산자):
		
		//x = y + z * (a + b) - d, 마지막 연산은 = 이다!
		
		int sum = 44;
		double count = 3;
		double avg = sum / count; 
		System.out.println(avg);
		
		//int와 int의 계산은 무조건 int!
		//계산되는 데이터  중 하나라도 실수가 있으면 무조건 실수!
		
		int sum2 = 44;
		int count2 = 3;
		double avg2 = sum2 / count2; 
		System.out.println(avg2);
		
		int sum3 = 44;
		int count3 = 3;
		double avg3 = sum3 / (double)count3; 
		System.out.println(avg3);
	}
}





