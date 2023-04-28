package oop0321;


class Unit {
	int currentHP;
	int x, y;
}//class end


interface Movable{
	void move(int x, int y);
}//interface end


interface Attackable{
	void attack(Unit u);
}//interface end


interface Fightable extends Movable, Attackable {
	//인터페이스간의 상속은 다중상속이 가능하다
}//interface end


class Fight extends Unit implements Fightable {
	//클래스간의 상속은 단일상속만 가능하다
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void attack(Unit u) {}	
}//class end


class Tetris extends Unit implements Movable, Attackable {
	//클래스 입장에서 클래스는 단일상속만 가능하고, 인터페이스는 다중구현이 가능하다
	@Override
	public void move(int x, int y) {}
	
	@Override
	public void attack(Unit u) {}
}//class end


public class Test04_interface {

	public static void main(String[] args) {
		//클래스와 인터페이스의 상속
	}//main() end
}//class end
