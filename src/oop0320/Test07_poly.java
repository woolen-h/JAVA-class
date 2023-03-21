package oop0320;

import java.util.GregorianCalendar;

public class Test07_poly {

	public static void main(String[] args) {
		// 다형성 Polymorphism
		/*Calendar now = new GregorianCalendar();
		Number inte = new Integer(3);*/
		/*Father fa = new Father();
		fa.disp();
		Son son = new Son("손흥민", "영국");
		son.disp();
		Daughter dau = new Daughter("김연아","한국");
		dau.disp();
		*/
		Father fa = new Son("개나리","역삼동");
		fa.disp();
		fa = new Daughter("진달래","서초동");
		fa.disp();
		System.out.println(fa.name);
		System.out.println(fa.addr);
		//System.out.println(fa.friend);
		/*Father father = new Father();
		Son son = new Son();
		son = (Son)father;
		double a = 3.4;
		int b = (int)a; // 강제형변환*/
		
		Object obj = new Integer(3);
		System.out.println(obj.toString());
		Integer inte = (Integer) obj;
		

	}

}
