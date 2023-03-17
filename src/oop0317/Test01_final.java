package oop0317;

import java.util.Calendar;
/*final class Animal{} // 종단 클래스 
class Elephant extends Animal{}*/ // > 오류
class Fruit {
	void view() {}
	final void disp() {}
}
class Apple extends Fruit {
	@Override
	void view() {
	
	}
	/*
	@Override
	void disp() {
	}
	*/// final override 불가
}
public class Test01_final {

	public static void main(String[] args) {
		// final 마지막
		// 변수 / 함수 /클래스 : 종단/후속 클래스 생성 X
		int a = 3;
		a = 5;
		
		final int b=2;
		//b=4; final은 다른값 불가능
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
	}

}
