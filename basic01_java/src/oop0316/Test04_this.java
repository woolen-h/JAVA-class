package oop0316;

public class Test04_this {

	public static void main(String[] args) {
		// this : 클래스가 자신을 가리키는 대명사, 일반지역변수와 멤버변수 구분
		//Score one = new Score("오필승",50,60,70);
		
		Score one = new Score();
		one.disp();
		Score two = new Score ("김연아",50,60,70);
		two.disp();
		Score three = new Score ("무궁화",50,60,70);
		three.disp();
		
		// 객체 참조 주소
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		
		Score kim = new Score("봉선화",10,10,15);
		Score lee = new Score("라일락",40,50,60);
		Score park = new Score("진달래",70,90,80);
		
		// 지역 / 전역 / 매개 / 참조
		// 객체 배열
		Score[] score = {
			new Score("오필승",20,10,25), 
			new Score("코리아",50,50,40), 
			new Score("대한민국",50,80,80)
		};
		/*
        +---------+---------+--------+
        |  #100   |  #200   |  #300  |
        +---------+---------+--------+
         score[0]   score[1]  score[2]
    */
		score[0].disp();
		score[1].disp();
		score[2].disp();
		
		int size = score.length;
		
		for(int i=0; i<size; i++) {
			score[1].disp();
		}
	}

}
