package oop0315;

import java.util.Arrays;

public class Test03_method {
	public static void test1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void test2(int[] a) {
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void test4(String[] a) {
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);}
	}
	public static void test5(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void test6(int[][] a) {
		for(int i=0;i<a.length; i++) {
			int col=a[i].length;
			for(int j=0; j<col; j++) {System.out.println(a[i][j]);}
			}
	}
	public static void main(String[] args) {
		// 메소드 호출 방식(Call by value / Call by reference)
		int[] num = {10,20,30};
		
		test1(num[0],num[2]); // 10, 30 - value
		test2(num); // -reference
		
		String[] name = {"무궁화","오필승","코리아"};
		test3(name[0], name[2]);
		test4(name);
		
		//[2행][3열]
		int[][] su = {{1,2,3}, {4,5,6}};
		
		test5(su[0][0], su[1][1]);
		test6(su);
		
		
		int[] lotto = {3,7,4,15,28,13};
		
		Arrays.sort(lotto);
		
		for (int i = 0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}

