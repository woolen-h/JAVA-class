package oop0316;

class sawon {
	// 멤버변수 field
	String sabun; //사원번호
	String name;//이름
	int pay;//급여
	
	// 생성자함수
	public sawon() {}
	public sawon(String sabun, String name, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}
	
	// static 변수
	static String COMPANY = "(주)아이티윌";
	static int SUDANG = 10;
	static double TAX = 0.03;
	// static 함수
	static void line() {
		System.out.println("----------------------------------");
	}
	 
}
