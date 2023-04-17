package crawling0328;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test03_choongang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String URL="https://www.choongang.co.kr/html/sub07_01_n.php";
			for(int p=1; p<=12; p++) {
				String params = "?page="+p+"&mod=&idx=";
				//System.out.println(params);
				Document doc=Jsoup.connect(URL+params).get();
				System.out.println(doc.toString());
			}// for end
		}catch (Exception e) {
			System.out.println("크롤링 실패 : "+e);
		}//end
	}//main
}//class
