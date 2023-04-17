package oop0321;

interface Creature {
	//void disp() {} 에러
	abstract void kind();
	void breathe();
}
class Tiger implements Creature {
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("포유류");
	}
	@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("허파");
	}
}
class Salmon implements Creature {

	@Override
	public void kind() {
		System.out.println("어류");		
	}

	@Override
	public void breathe() {
		System.out.println("아가미");		
	}
	
}