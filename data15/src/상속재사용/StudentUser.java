package 상속재사용;

public class StudentUser {

	public static void main(String[] args) {
		Element e = new Element();
		Middle m = new Middle();
		High h = new High();
		University u = new University();
		
		e.study();
		m.study();
		h.study();
		u.study();
	}

}
