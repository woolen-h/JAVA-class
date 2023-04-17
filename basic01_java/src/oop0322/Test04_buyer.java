package oop0322;

public class Test04_buyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		HandPhone phone = new HandPhone();
		
		Buyer kim = new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		kim.buy(note);
		kim.buy(note);
		kim.buy(note);
		
		kim.disp();
	}

}
