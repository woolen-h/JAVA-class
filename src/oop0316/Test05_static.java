package oop0316;

public class Test05_static {

	public static void main(String[] args) {
		// static : 변수(정적/클래스변수), 함수 / 메모리 생성 1 소멸 1
		// 클래스명.변수 / 클래스명.함수()로 접근 가능
		/*System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		System.out.println(String.format("%.2f", 12.34567));*/
		// static은 클래스명 직접접근
		System.out.println(sawon.COMPANY);
		System.out.println(sawon.SUDANG);
		System.out.println(sawon.TAX);
		sawon.line();
		
		// 1) static의 특징 적용 X
		sawon one = new sawon("1001","개나리",100);
		double myTax = one.pay*one.TAX;
		int total = (int)(one.pay-myTax+one.SUDANG);
		
		System.out.println("회사 : "+one.COMPANY);
		System.out.println("사번 : "+one.sabun);
		System.out.println("이름 : "+one.name);
		System.out.println("급여 : "+one.pay);
		System.out.println("수당 : "+one.SUDANG);
		System.out.println("세금 : "+myTax);
		System.out.println("총지급액 : "+total);
		one.line();
		// 2) static의 특징 적용 O(추천)
		sawon two = new sawon("1002","진달래",200);
		myTax = two.pay*sawon.TAX;
		total=(int)(two.pay-myTax+sawon.SUDANG);
		System.out.println("회사 : "+two.COMPANY);
		System.out.println("사번 : "+two.sabun);
		System.out.println("이름 : "+two.name);
		System.out.println("급여 : "+two.pay);
		System.out.println("수당 : "+two.SUDANG);
		System.out.println("세금 : "+myTax);
		System.out.println("총지급액 : "+total);
		// 3) static 변수의 연산 : 생성 1 소멸 1
		sawon kim = new sawon ("1003","봉선화",300);
		sawon lee = new sawon ("1004","라일락",400);
		System.out.println(kim.SUDANG);
		System.out.println(lee.SUDANG);
		kim.SUDANG = kim.SUDANG+1;
		System.out.println(kim.SUDANG);
		lee.SUDANG = lee.SUDANG+1;
		System.out.println(lee.SUDANG);
		sawon.SUDANG = sawon.SUDANG+1;
		System.out.println(sawon.SUDANG);
		System.out.println(kim.SUDANG);
		System.out.println(lee.SUDANG);
		
		
	}

}
