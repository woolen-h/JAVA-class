package oop0315;

public class Sungjuk {
// package 기본
// 클래스명 첫글자 대문자
	//멤버변수(필드)
	public String name; // > 클래스 외부
	int kor, eng, mat;	// > package
	private int aver;	// > 클래스 내부
	//멤버함수(메소드)
	private void view() {}
	void calc() {
		// 클래스 내부 간 Access Modifier 상관없이 접근
		aver = (kor+eng+mat)/3;
		view();
	} // package 생략
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
} // class end
