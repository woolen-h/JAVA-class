package oop0320;

public class Test06_jumin {

	public static void main(String[] args) {
		// 문제) 주민번호 유효성 검사
		Jumin id = new Jumin("8912301234567");
		if(id.validate()) {
			System.out.println("주민번호 맞다");
			id.disp();
		}else {
			System.out.println("주민번호 틀리다");
		}
	}

}
