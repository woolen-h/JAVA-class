package oop0321;

public class Test03_interface {

	public static void main(String[] args) {
		// 인터페이스 : 추상메소드로만 구성, 상속(extends 확장, implements 구현)
		// Creature creature = new Creature;
		Creature creature = null;
		creature = new Tiger();
		creature.kind();
		creature.breathe();
		creature = new Salmon();
		creature.kind();
		creature.breathe();
	}

}
