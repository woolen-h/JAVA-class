package oop0320;

public class Test03_super {

	public static void main(String[] args) {
		// 문1)주민번호의 각 숫자의 합을 구하시오 (Character 클래스와 chatAt() 함수를 이용)
		// String jumin="8912301234567"
		String jumin = "8912301234567";
		int sum = 0;
		for (int i = 0; i < jumin.length(); i++) {
		    char c = jumin.charAt(i);
		    if (Character.isDigit(c)) {
		        sum += Character.getNumericValue(c);
		    }
		}
		System.out.println("주민번호의 각 숫자의 합: " + sum);
		
		
		// 문2)대소문자를 서로 바꿔서 출력하시오 (Character 클래스와 chatAt() 함수를 이용)
		// String str="Gone With The Wind"
		String str = "Gone With The Wind";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
		    char c = str.charAt(i);
		    if (Character.isLowerCase(c)) {
		        result.append(Character.toUpperCase(c));
		    } else if (Character.isUpperCase(c)) {
		        result.append(Character.toLowerCase(c));
		    } else {
		        result.append(c);
		    }
		}
		System.out.println("대소문자를 서로 바꾼 결과: " + result.toString());
	}

}
