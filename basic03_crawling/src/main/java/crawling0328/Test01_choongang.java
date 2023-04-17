package crawling0328;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test01_choongang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String URL="https://www.choongang.co.kr/html/sub07_01_n.php";
			Document doc=Jsoup.connect(URL).get();
			System.out.println(doc.toString());
		}catch (Exception e) {
			System.out.println("크롤링 실패 : "+e);
		}//end
	}//main
}//class
