package oop0314;

public class Test03_array {

	public static void main(String[] args) {
		// 배열 array
		// 연속성 자료형, 열거형
		// - 1차원
		// - 2차원
		// - 3차원 <X
		
		
		// 1. 1차원 배열
		int[] kor=new int[3]; // 4바이트 3개 12바이트
		kor[0]=10;
		kor[1]=30;
		kor[2]=50;
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		//Exception
		//System.out.println(kor[3]);
		
		System.out.println(kor.length); // kor 배열 요소의 갯수
		
		// 메모리 할당 및 초기값 지정
		int[] eng= {20, 30, 40};
		for(int i=0; i<eng.length; i++) {
			System.out.println(eng[i]);
		}
		
		double[] aver= {1.2, 3.4, 5.6};
		for(int i=0; i<aver.length; i++) {
			System.out.println(aver[i]);
		}
		
		char[] ch= {'h','e','l','l','o'};
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String[] name= {"개나리","진달래","무궁화"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);}
		
		// 2. 2차원 배열 [행][열]
		// 2행 3열
		
		int[][] mat=new int[2][3]; // 4바이트 6개 24바이트
		mat[0][0]=10;
		mat[0][1]=20;
		mat[0][2]=30;
		mat[1][0]=50;
		mat[1][1]=60;
		mat[1][2]=70;

		
		for(int r=0; r<=1; r++) {
			for(int c=0; c<=2; c++) {
				System.out.println(mat[r][c]);
			}
		}
		// Exception
		// System.out.println(mat[4][4]);
		
		System.out.println(mat.length); // 행의 갯수
		System.out.println(mat[0].length); // mat[0]행의 열의 갯수
		System.out.println(mat[1].length);
		
		// 2차원 배열 / 행의 열의 개수 달라도 됨
		int[][] music = {
				{10,20}
				,{30,40,50,60}
				,{70,80,90}
		};
		
		System.out.println(music.length);
		System.out.println(music[0].length);
		System.out.println(music[1].length);
		System.out.println(music[2].length); // 각 행의 열의 갯수
		
		
		int rows = music.length;
		int cols = 0;
		for (int i = 0; i < rows; i++) {
		    int rowCols = music[i].length;
		    if (rowCols > cols) {
		        cols = rowCols;
		    }
		}
		
		
		System.out.println("Music Table:");
		for (int n = 0; n < rows; n++) {
		    for (int m = 0; m < cols; m++) {
		        if (m < music[n].length) {
		            System.out.printf("%-5d", music[n][m]);
		        } else {
		            System.out.print("     ");
		        }
		    }
		    System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
