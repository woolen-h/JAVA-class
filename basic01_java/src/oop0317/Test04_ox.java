package oop0317;

public class Test04_ox {

	public static void main(String[] args) {
		// 문제 > 성적프로그램 OX표시
		/*
         ** 시험결과 **
====================================
번호  이름   1  2  3  4  5  점수  등수      
------------------------------------    
1   홍길동  O  X  O  O  O   80   2    
2   무궁화  O  O  O  O  O  100   1
3   라일락  X  X  X  X  O   20   5
4   진달래  X  O  X  O  O   60   3
5   봉선화  O  O  X  X  X   40   4
------------------------------------ 

- 맞은문제 O, 틀린문제 X표시
- 점수: O당 20점씩
- 등수: 점수를 기준으로 높은사람이 1등 
*/
		// 1) 한명의 성적
		//Jumsu student = new Jumsu(1, "홍길동", 3,4,3,3,3);
		/*Jumsu student2 = new Jumsu(2, "무궁화", 3,3,3,3,3);
		Jumsu student3 = new Jumsu(3, "라일락", 2,2,2,2,3);
		Jumsu student4 = new Jumsu(4, "진달래", 4,3,1,3,3);
		Jumsu student5 = new Jumsu(5, "봉선화", 3,3,1,2,4);*/
		Jumsu[] student = {
				new Jumsu(1, "홍길동", 3,4,3,3,3),
				new Jumsu(2, "무궁화", 3,3,3,3,3),
				new Jumsu(3, "라일락", 2,2,2,2,3),
				new Jumsu(4, "진달래", 4,3,1,3,3),
				new Jumsu(5, "봉선화", 3,3,1,2,4)
		};
	}

}
