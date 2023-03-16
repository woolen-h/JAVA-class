package oop0314;

import java.util.Arrays;

public class Test05_sort {

	public static void main(String[] args) {
		// 정렬 Sort
		// 정렬 유형 : 오름, 내림
		// 정렬 방식 : 삽입(insertion) / 선택(selection) / 버블(bubble)
		
		int[] su = {9,8,7,6,5};
		
		Arrays.sort(su);
		
		for(int idx=0; idx<su.length; idx++) {
			System.out.println(su[idx]);
		}
	}

}
