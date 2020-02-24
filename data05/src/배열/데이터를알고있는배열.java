package 배열;

public class 데이터를알고있는배열 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "김길동", "송길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 아는 사람들의 나이(int): for, foreach
		int[] ages = { 100, 55, 77, 10, 25 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int i : ages) {
			System.out.println(i);
		}
		
		// 성별(char)

		char[] gender = { '남', '남', '여', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}

		for (char c : gender) {
			System.out.println(c);
		}

		// 시력(double)
		double[] eye = { 0.3, 1.5, 0.7, 0.9, 1.0 };

		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		for (double d : eye) {
			System.out.println(d);
		}

		System.out.println("----------------");
		char[] c = { 'a', 'b', 'c' };
		System.out.println(c);

	}
}
