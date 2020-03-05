package 크롤링;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		try {
			Connection con	= Jsoup.connect("http://www.naver.com");
			//System.out.println(con);
			Document doc = con.get();
//			System.out.println(doc);
			Elements list = doc.select("span.an_txt");
			System.out.println(list.size());
			System.out.println(list.get(0).text());
			System.out.println(list.get(1).text());
			System.out.println("------");
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).text());
//			}
			String[] contents = new String[list.size()];
			for (int i = 0; i < contents.length; i++) {
				contents[i] = list.get(i).text();
			}
			
			for (String s : contents) {
				System.out.println(s);
			}
			
			FileWriter file = new FileWriter("naver.txt");
			for (String s : contents) {
				file.write(s + "\n");
			}
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Document doc = Jsoup.connect("http://www.naver.com").get();
				
		
	}

}
