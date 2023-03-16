package oop0313;

public class Test04_operator {

	public static void main(String[] args) {
		// 연산자
		// 산술, 비교(관계), 논리연산자
		// 삼항, 대입, 1증감 연산자
		
		System.out.println(5/3);
		System.out.println(5%3);
		
		System.out.println(3/5);
		System.out.println(3%5);
		
		System.out.println(3.0/5.0);
		System.out.println(3/5.0);
		System.out.println(3.0/5);
		System.out.println(3/5.);
		
		// bit 연산자
		
		// 1) 비트곱, 비트합 연산자
		// 논리곱 	and 	&&
		// 논리합 	or	 	||
		
		System.out.println(5&3);
		System.out.println(5|3);
		
		// 2) 비트 부정 연산자
		// 논리 부정 not !
		
		System.out.println(~5);
		
		/*
		 2진수 : 0 1
		 8진수 : 0 1 2 3 4 5 6 7
		 10진수: 0 1 2 3 4 5 6 7 8 9
		 16진수: 0 1 2 3 4 5 6 7 8 9 a b c d e f 
		 
		 */
		
		// 3) shift 연산자
		System.out.println(16<<3); // 128 	left shift
		System.out.println(16>>3); // 2 	right shift
	}

}
