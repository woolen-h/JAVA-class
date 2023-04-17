package oop0320;

class School extends Object{
String name="학교";
public School() {
	System.out.println("School()...");
}
}
class MiddleSchool extends School {
	public MiddleSchool() {
		System.out.println("MiddleSchool()...");
	}
	public void disp() {
		System.out.println(name);
	}
}
class HighSchool extends School {
	String name="고등학교";
	public HighSchool() {
		System.out.println("HighSchool()...");
	}
	public void disp() {
		String name="강남 고등학교";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
