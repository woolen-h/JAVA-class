package oop0316;

import java.util.StringTokenizer;

public class Test03_quiz {

	public static void main(String[] args) {
		// 연습문제
		//문1) 이메일 주소에 @문자 있으면
        //    @글자 기준으로 문자열을 분리해서 출력하고
        //    @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오        
        /*    
              출력결과
              webmaster
              itwill.co.kr
        */
		
		String email = new String("webmaster@itwill.co.kr");
		String[] word = email.split("@");
		for (int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		if (email.contains("@")) {
			System.out.println("이메일 주소 정상");
		} else {
			System.out.println("이메일 주소 틀림");
		}
		
		if(email.indexOf("@")==-1) {
			System.out.println("이메일 주소 틀림!");
		} else {
			System.out.println("이메일 주소 맞음!");
		}
		int pos = email.indexOf("@");
		System.out.println(pos); // 9
		String id = email.substring(0, pos);
		String server = email.substring(pos+1);
		System.out.println(id);
		System.out.println(server);
		// 문2) 이미지 파일만 첨부 (.png, .jpg, .gif)
		/*
		 * 출력결과
		 * 파일명 : sky2023.03.16
		 * 확장명 : jpg*/
		
		String path = new String("i:/frontend/images/sky2023.03.16.ppt");
		String[] word2 = path.split("/");
		for (int i=3; i<word2.length; i++) {
			String sub = word2[i].substring(0, word2[i].length()-4);
			System.out.println(sub);
		}
		for (int i=3; i<word2.length; i++) {
			String files = word2[i].substring(13,17);
			System.out.println(files);
		}
		for (int i=3; i<word2.length; i++) {
			String sub = word2[i].substring(word2[i].lastIndexOf(".")+1);
			System.out.println(sub);
		}
		
		int lastSlash = path.lastIndexOf("/");
		System.out.println(lastSlash);
		
		String file = path.substring(lastSlash+1);
		System.out.println("전체 파일명 : " + file);
		
		int lastDot = file.lastIndexOf(".");
		System.out.println(lastDot); //13
		
		String filename = file.substring(0, lastDot);
		System.out.println("파일명 : " + filename);
		
		String ext = file.substring(lastDot+1);
		System.out.println("확장명 : " + ext);
		
		// 확장명을 전부 소문자로 치환
		ext = ext.toLowerCase();
		if(ext.equals("png") || ext.equals("jpg") || ext.equals("gif")){
			System.out.println("파일이 전송되었습니다~");
		} else {
			System.out.println("이미지 파일이 아닙니다!");
		}
		
		
		

	}

}
