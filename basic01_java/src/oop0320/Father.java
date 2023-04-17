package oop0320;

class Father {
// 멤버 변수 field
	public String name="아버지";
	public String addr="주소";
// 생성자 함수 constructor
	public Father() {}
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
// 멤버 함수 method
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}
class Son extends Father {
	public Son() {}
	public Son(String n, String a) {
		super.name=n;
		super.addr=a;
	}
}
class Daughter extends Father {
	String friend = "절친";
	public Daughter () {}
	public Daughter (String n, String a) {
		super(n,a);
	}
}
