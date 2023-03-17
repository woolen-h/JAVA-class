package oop0317;

public class Jumsu {
	// 멤버변수 field / 생성자함수 constructor / 멤버함수 method
	// 번호 / 이름 / OX표시 / 점수 / 등수 / 답안지 제출
	private int no; // 번호
	private String name; // 이름
	private char[] ox = new char[5]; // OX
	public int score; // 점수
	public int rank; // 등수
	private int[] answer = new int[5]; // 답안지 제출
	
	public Jumsu () {}
	public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
		this.no = no;
		this.name = name;
		this.answer[0] = a0;
		this.answer[1] = a1;
		this.answer[2] = a2;
		this.answer[3] = a3;
		this.answer[4] = a4;
		this.rank=1;
	}
	public void compute() {
		// 문제 ) 정답과 답안을 비교해서 ox를 구하고 갯수에 따라 점수를 구하시오.
		int[] dap = {3,3,3,3,3};
		/*
		int[] ox = new int[5];
		for (int i=0; i<5; i++) {
			if (answer[i]==dap[i]) {
				ox[i] = 1;
			}else {
				ox[i] = 0;
			}
		}
		int count = 0;
		for (int i=0; i<5; i++) {
			if(ox[i] == 1) {
				count++;
			}
		}
		int score = count*20;*/
		/*
		 * if(dap[0]==answer[0])
		 * if(dap[1]==answer[1])
		 * if(dap[2]==answer[2])
		 * if(dap[3]==answer[3])
		 * if(dap[4]==answer[4])
		 * */
		for (int i=0; i<5; i++) {
			if(dap[i]==answer[i]) {
				ox[i]='o';
				score=score+20;
			}else {
				ox[i]='x';
				score=score+0;
			}
		}
	}
	public void disp() {
		System.out.print(no+" ");
		System.out.print(name+" ");
		System.out.print(ox[0]+" ");
		System.out.print(ox[1]+" ");
		System.out.print(ox[2]+" ");
		System.out.print(ox[3]+" ");
		System.out.print(ox[4]+" ");
		System.out.print(score+" ");
		System.out.print(rank+" ");
		System.out.println();
	}
	}
