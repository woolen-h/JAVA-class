package oop0314;

public class Test04_quiz {

	public static void main(String[] args) {
		// 배열 연습 문제
		char[] ch = {'I','t','W','i','l','l'};
		int size = ch.length;
		
		// 문1) 대, 소문자의 개수를 각각 구하시오.
		int uppercaseCount = 0;
		int lowercaseCount = 0;

		for (int i = 0; i < size; i++) {
		    if (Character.isUpperCase(ch[i])) {
		        uppercaseCount++;
		    } else if (Character.isLowerCase(ch[i])) {
		        lowercaseCount++;
		    }
		}

		System.out.println("대문자 개수: " + uppercaseCount);
		System.out.println("소문자 개수: " + lowercaseCount);
		System.out.println("----------------------------");
		// 문2) 대소문자를 서로 바꿔서 출력하시오.
		for (int i = 0; i < size; i++) {
			char c = ch[i];
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			}
			System.out.print(c);
		};
		System.out.println("\n----------------------------");
		// 문3) 모음의 개수를 구하시오
		int vowelCount = 0;

		for (int i = 0; i < size; i++) {
		    char c = ch[i];
		    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		        vowelCount++;
		    }
		}
		System.out.println("모음의 개수: " + vowelCount);
		System.out.println("----------------------------");
		// 문4) 각 행의 모음의 개수를 구하시오
		char[][] str = {
				{'Y','e','a','r'}
				,{'M','o','n','t','h'}
				,{'D','a','t','e'}
		};
		
		int rowCount = str.length;

		for (int i = 0; i < rowCount; i++) {
		    int vowelCount4 = 0;
		    for (int j = 0; j < str[i].length; j++) {
		        char c = str[i][j];
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		            vowelCount4++;
		        }
		    }
		    System.out.println("행 " + (i+1) + "의 모음의 개수: " + vowelCount4);
		}
		System.out.println("----------------------------");
		// 문5) 대각선 방향의 각 요소의 합을 구하시오
		int[][] num = {
				{4,3,2}
				,{5,9,1}
				,{6,8,7}
		};
		int sizes = num.length;
		int sum1 = 0; // 좌측에서 우측으로 향하는 대각선 요소의 합
		int sum2 = 0; // 우측에서 좌측으로 향하는 대각선 요소의 합

		for (int i = 0; i < sizes; i++) {
		    sum1 += num[i][i];
		    sum2 += num[i][sizes-1-i];
		}

		System.out.println("대각선 방향의 요소의 합: " + sum1);
		System.out.println("대각선 방향의 요소의 합: " + sum2);
	}//main end
}//class end
