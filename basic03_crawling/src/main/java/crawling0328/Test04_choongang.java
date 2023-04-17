package crawling0328;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test04_choongang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName="I:/java202301/choongang.txt";
			FileWriter fw=new FileWriter(fileName, true);
			PrintWriter out=new PrintWriter(fw);
			
			String URL="https://www.choongang.co.kr/html/sub07_01_n.php";
			for(int p=1; p<=12; p++) {
						String params = "?page="+p+"&mod=&idx=";
						//System.out.println(params);
						Document doc=Jsoup.connect(URL+params).get();
						//System.out.println(doc.toString());
						/*
						 				 
						 */
						Elements elements=doc.select(".board_default_list .default_title");
						for(Element element : elements) {//for(개별 : 덩어리)
							System.out.println(element.text());
							out.println(element.text());
						}//for end
					}// for end
			out.close();
			fw.close();
			System.out.println("공지사항 제목 저장 완성");
		}catch (Exception e) {
			System.out.println("크롤링 실패 : "+e);
		}//end
	}//main
}//class
