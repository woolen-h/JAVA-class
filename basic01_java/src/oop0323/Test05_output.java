package oop0323;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test05_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "I:/java202301/sungjuk.txt";
		FileWriter fw = null;
		PrintWriter out = null;
		try {
			fw = new FileWriter(filename, false);
			out = new PrintWriter(fw, true);
			out.println("무궁화,95,90,100");
			out.println("홍길동,100,100,100");
			out.println("라일락,90,95,35");
			out.println("개나리,85,70,75");
			out.println("진달래,35,40,60");
			System.out.println("sungjuk.txt 데이터 파일 생성");
		} catch (Exception e) {
			System.out.println("파일 쓰기 실패 : "+e);
		} finally {
			try {
				if(out!=null) {out.close();}	
			} catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			} catch (Exception e) {}
		} 
	}

}
