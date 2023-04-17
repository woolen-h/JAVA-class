package crawling0328;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class Test05_soldesk {

	public static void main(String[] args) {
		// 과제) 글 제목만 크롤링하여 soldesk.txt 파일에 저장
		 String url = "https://soldesk.com/Notice";

	        try {
	            Document document = Jsoup.connect(url).get();

	            // 공지사항 게시글 목록 가져오기
	            Elements notices = document.select("div[class='notice_area'] ul li a");

	            // 공지사항 제목 출력 및 파일에 저장
	            FileWriter writer = new FileWriter("I:/java202301/soldesk.txt");
	            for (Element notice : notices) {
	                String title = notice.text();
	                System.out.println(title);
	                writer.write(title + "\n");
	            }
	            writer.close();
	            System.out.println("공지사항 제목 저장 완성");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}//main

}//class
