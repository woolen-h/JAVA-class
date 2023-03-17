package oop0317;
class Sungjuk {
	private String name;
	private int kor, eng, mat;
	private int aver;
	// 기본 생성자 함수
	public Sungjuk() {
		//Sungjuk("손흥민"); // 에러
		this("손흥민");
	}
	public Sungjuk(String name) {
		this.name=name; // this.멤버변수 = 매개변수
	}
	public Sungjuk(int kor, int eng, int mat) {
		this("박지성"); 
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		// this("박지성"); > 자신의 생성자 함수 호출시 첫줄로
	}
	public Sungjuk(int aver) {
		disp(); // 일반 메소드 호출 가능
	}
	public void disp() {
		// this(85); > 일반 메소드에서는 호출 불가능
	}
}
public class Test03_this {

	public static void main(String[] args) {
		// this() : 생성자함수 호출	

	}

}
