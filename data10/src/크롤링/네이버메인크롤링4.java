package 크롤링;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버메인크롤링4 {

	public static void main(String[] args) {
		try {
			Connection con	= Jsoup.connect("https://www.melon.com/chart/index.htm");
			Document doc = con.get();
			Elements list = doc.select(".checkEllipsis > a");
			System.out.println(list);
			System.out.println(list.size());
			//System.out.println(list);
			//Elements list2 = doc.select(".image_typeAll img");
			//System.out.println(list2.get(0).attr("src"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Document doc = Jsoup.connect("http://www.naver.com").get();
				
		
	}

}
