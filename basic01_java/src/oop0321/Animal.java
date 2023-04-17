package oop0321;

abstract class Animal {
	String name;
	void view() {} // 일반
	abstract void disp(); // 추상
}

class Elephant extends Animal { // override로 완성
	@Override
	void disp() {
		System.out.println("점보");				
	}
}
class Tuna extends Animal {
	@Override
	void disp() {
		System.out.println("니모");
	}
}