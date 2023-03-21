package oop0321;

public class Test01_abstract {

	public static void main(String[] args) {
		// 추상 클래스 Abstract class
		/*
		 * 추상 클래스
		 * - 미완성
		 * - 객체 생성 X new 연산자 직접 사용 X
		 * - 추상메소드 1개라도 있으면 추상 클래스
		 * 
		 * 추상 메소드
		 * - 리턴형 함수명 ();
		 * - {}가 없는 함수
		 * 
		 * 인터페이스(interface)
		 * 
		 * */
		// Animal ani = new Animal(); // new 사용 불가
	Elephant jumbo = new Elephant();
	jumbo.disp();
	
	Tuna nemo = new Tuna();
	nemo.disp();
	
	Animal animal = new Elephant(); // 다형성
	animal.disp();
	
	animal = new Tuna();
	animal.disp();

}
	
}