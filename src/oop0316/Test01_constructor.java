package oop0316;

public class Test01_constructor {

	public static void main(String[] args) {
		// 생성자 함수 > 클래스명과 동일

		//new School();
		//new School();
		
		School one = new School("개나리");
				one.calc();
				one.disp();
				
		School two = new School(70,80,90);
		two.calc();
		two.disp();
		
		School three = new School("진달래",10,20,30);
		three.calc();
		three.disp();
	}

}
