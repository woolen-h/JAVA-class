package oop0316;

class Score {
	// 멤버변수 field
	private String name="손흥민";
	private int kor, eng, mat;
	private int aver;
	// 생성자 함수 constructor : 오버로드 시 기본생성자 함수 자동 생성 X > 수동생성 추천
	public Score() {}
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.aver=(kor+eng+mat)/3;
	}
	
	public void disp() {
		String name = "박지성";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}
