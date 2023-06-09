package oop0313;

public class Test05_conversion {

	public static void main(String[] args) {
		// 자료형 변환(Datatype Conversion)
		
		// 1. 자동형변환
		// 정수형 : byte < short < int < long
		// 실수형 : float < double
		byte a=3;
		int b=a;		// 자동형변환
		long c=b;
		//a=c;
		
		float d=3.4f;
		double e=d;		// 자동형변환
		
		// 2. 강제형변환 (cast연산)
		// -> 필요한 곳에서 일시적으로 변환
		// -> 형식) (자료형)값
		
		System.out.println((int)3.5);
		System.out.println((double)4);
		System.out.println((int)2.6+(int)5.7);
		System.out.println((int)(2.6+5.7));
		
		
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'C');
		
		System.out.println((int)'a');
		System.out.println((int)'b');
		System.out.println((int)'c');
		
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);
		
		System.out.println((char)97);
		System.out.println((char)98);
		System.out.println((char)99);
		
		System.out.println((int)' ');
		System.out.println((int)'\r');
		
		System.out.println('A'<'a');
		
		//문) 임의의 문자가 소문자인지 확인하시오
		// 소문자 'a'~'z'
		
		char ch='r';
		String result=(ch>='a' && ch<='z') ? "소문자" : "기타";
		System.out.println(result);
		
		
		
		
		
		
		
		
		

	}

}
