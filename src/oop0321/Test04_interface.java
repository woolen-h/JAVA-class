package oop0321;
class Unit {
	int currentHP;
	int x, y;
}
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}
interface 
Fightable extends Movable, Attackable {}
// 인터페이스 간 다중상속 가능

class Fight extends Unit implements Fightable{
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
class Tetris extends Unit implements Movable, Attackable {
	
}
public class Test04_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
