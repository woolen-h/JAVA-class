package oop0315; // 저장 위치
// 저장 위치(패키지) 선언
import java.io.*;
import java.sql.*;
import java.util.Arrays; 	// 해당 클래스 직접 선언
import java.awt.*;			// GUI 클래스 선언
import javax.swing.*;		// GUI 클래스 선언



// Access Modifier 접근 제어, 접근 수정
// private > package > protected(상속관계) > public

public class Test06_class {
 
	public static void main(String[] args) {
		// 클래스와 객체(Object)
		// 첫 글자 대문자
		// 구성 : 멤버변수, 멤버함수
		
		// Sungjuk 클래스 테스트
	 //System.out.println(Math.E);		//멤버변수
	 //System.out.println(Math.PI);
	 //System.out.println(Math.abs(-3));	//멤버함수
		
		// 자료형 : 기본 / 참조(클래스)
		
		// new 연상자 : 클래스 사용하기 위한 메모리 할당(클래스 객체 / 인스턴스)
		// new 클래스명 ()
		
		// 객체 지향 프로그램
		// 기본 자료형
		int a=3; // 4바이트
		// 참조 자료형
		// 램의 heap 영역에 메모리 할당 및 주소 발생
		// new Sungjuk(); > 객체 / 인스턴스
		
		// sj > 참조변수 (reference)
		Sungjuk sj = new Sungjuk();
		// . 연산자 : 객체에 접근
		sj.name = "손흥민";
		sj.kor = 100;
		sj.eng = 95;
		sj.mat = 80;
		// aver 에러 / private 속성 / 접근 불가
		sj.calc();
		sj.disp();
		// sj.view();
		// view 에러 / private 속성 / 접근 불가
		
		Sungjuk one = new Sungjuk();
		one.name = "박지성";
		one.kor = 20;
		one.eng = 30;
		one.mat = 35;
		
		one.calc();
		one.disp();
		
		Sungjuk two = new Sungjuk();
		two.name = "김연아";
		two.kor = 100;
		two.eng = 95;
		two.mat = 90;
		
		two.calc();
		two.disp();
		
		// 참조변수가 가지고 있는 객체의 주소값
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		int i = 3;
		int j = i;
		
		Sungjuk tmp = two;
		System.out.println(tmp.hashCode());
		
		tmp.disp();
	}

}

