package oop0313;

public class Test02_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 콘솔창 출력
		
		System.out.print(123); 		// 숫자 데이터
		System.out.print("SEOUL");	// 문자열 데이터
		
		System.out.println(123);
		System.out.println(456);
		System.out.println(789);
		
		// 단축키 : syso ctrl+space
		System.out.println();
		
		// 문자열 데이터 구분 기호 ""
		System.out.println("JAVA");
		System.out.println("PYTHON");
		System.out.println(123);	// 숫자형
		System.out.println("456");	// 문자열형
		
		// " ' \ 등을 단순 기호로 인식하고자 할 때
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");
		
		// + 연산자
		System.out.println(123+456);
		System.out.println("123"+"456");
		System.out.println(123+"456");
		System.out.println("123+456");
	}

}
