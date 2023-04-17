package oop0316;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Test02_String {

	public static void main(String[] args) {
		// 문자열 관련 클래스
		String str = "HAPPY";
		String name = new String("HAPPY");
		
		if(str==name) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		} 
		// 문자열의 내용 비교 시 equals() 함수 이용
		if(str.equals(name)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// 문자열 갯수가 0인지?
		if(str.isEmpty()) {
			System.out.println("빈문자열이다");
		}else {
			System.out.println("빈문자열 아니다");
		}
		//특정 문자를 기준 문자열 분리
		str = new String("Gone With The Wind");
		String[] word = str.split(" ");
		for (int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		// 문자열에서 공백문자를 기준 분리
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreElements()) { // 토큰할 문자가 있는지?
			System.out.println(st.nextToken()); // 토큰할 문자열 가져오기
		}
		// 문자열 연산 속도 : String < StringBuffer < StringBuilder
		String s1="";
		System.out.println(s1.length());
		
		s1 = s1 + "ONE";
		System.out.println(s1.length());
		
		s1 = s1 + "TWO";
		System.out.println(s1.length());
		
		s1 = s1 + "THREE";
		System.out.println(s1.length());
		System.out.println(s1);
		
		// 모든 문자열 지우기(빈 문자열 대입)
		s1="";
		System.out.println(s1.length());
		System.out.println("#"+s1+"#");
		//
		StringBuilder s2 = new StringBuilder();
		s2.append("SEOUL");
		System.out.println(s2.length() + s2.toString());
		s2.append("JEJU");
		System.out.println(s2.length() + s2.toString());
		s2.append("BUSAN");
		System.out.println(s2.length() + s2.toString());
		// 모든 문자열 지우기
		//s2="0";
		
		s2.delete(0, s2.length());
		System.out.println(s2.length());
		
		StringBuffer s3 = null;
		System.out.println(s3.length());
	}
	}

