package oop0315;

public class Test01_method {

	public static int test1(int a, int b) { // 리턴값 있는경우 자료형을 void 자리에 씀
		int c=a+b;
		// return; 리턴 값이 없다
		return c; // 리턴 값은 1개만 리턴 가능
	} // test1 end
	
	public static String test2(int a) {
	    if (a % 2 == 0) {
	        return "짝수";
	    } else {
	        return "홀수";
	    }
	}
	
	public static boolean test3(int year) {
	    if (year % 4 != 0) {
	        return false;
	    } else if (year % 100 != 0) {
	        return true;
	    } else if (year % 400 != 0) {
	        return false;
	    } else {
	        return true;
	    }
	}
	
	public static long test4(int n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    } else {
	        return n * test4(n - 1);
	    }
	}
	
	public static void main(String[] args) {
		// 2. 리턴 값이 있는 경우
		
		System.out.println(Math.abs(-3));
		System.out.println(Math.max(5,7));
		
		int result = test1(2,4);
		System.out.println(result);
		
		System.out.println(test1(5,6));
		
		// 짝수, 홀수 출력
		String str = test2(7);
		System.out.println(str);
		
		// 윤년 확인
		if(test3(2023)) {System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		//3. 재귀적 함수 호출
		// 팩토리얼 값 구하기
		
	}

}
