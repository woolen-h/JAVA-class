package oop0315;

class School {
	// 멤버 변수 field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// 생성자 함수(리턴형 X : public void School(){} XXXXX)
	public School() {// 기본 생성자 함수(default constructor) : 지동으로 생성
		System.out.println("School() 호출됨...");
	}
	// 멤버 함수 method
	public void calc() {
		aver = (kor + eng + mat) / 3;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
}
