package oop0315;

public class Test08_constructor {

	public static void main(String[] args) {
		// 생성자함수 연습
		//new School(); // 객체 / 인스턴스
		//new School();
		
		School one = new School(); 
		System.out.println(one.hashCode());
		one.calc();
		one.disp();
		
		
		String a = new String();
		String b = null;
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println("null");
	}

}
