package oop0315;

public class Test02_overload {
	public static void hap (int a) {
		System.out.println(a);
	}
	public static void hap (int a, int b) {
		System.out.println(a+b);
	}
	public static void hap (double a) {
		System.out.println(a);
	}
	public static void hap (double a, double b) {
		System.out.println(a+b);
	}
	/*public static int hap (double a, double b) {
		System.out.println(a+b);
	}*/
	
	/*
	 * 함수의 리턴형은 메소드 오버로드의 조건이 아니다*/
	public static void main(String[] args) {
		// overload 함수명 중복정의
		// 전제조건 : 매개변수의 자료형, 갯수가 달라야 한다
		hap(3);
		hap(2,4);
		hap(5.6);
		hap(9.8,7.6);
		
		// 절대값 구하기
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(4L));
		System.out.println(Math.abs(5.6f));
		System.out.println(Math.abs(7.8d));
	}

}
