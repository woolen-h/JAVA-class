package oop0313;

public class Test07_format {

	public static void main(String[] args) {
		// 출력서식
		/*
		 * \n 줄바꿈
		 * \t 탭
		 * \r
		 * \b
		 * 
		 * %d 10진 정수형
		 * %f 실수형
		 * %c 문자형
		 * %s 문자열형
		 * 
		 * System.out.printf("출력서식", 값);
		 * */
		
		System.out.print("사과\n참외\n\n수박\n\n\n");
		System.out.print("바\t\t나\t나");
		System.out.print("\n\n딸기");
		
		System.out.printf("%d %d %d\n", 3, 5, 7);
		System.out.printf("나이:%d\n", 25);
		System.out.printf("a:%d\t b:%d\t c:%d\n", 2, 4, 6);
		
		System.out.printf("#%5d#\n", 123);
		System.out.printf("#%-5d#\n", 123);
		System.out.printf("#%05d#\n", 123);
		
		System.out.printf("x:%f y:%f z:%f\n", 1.2, 3.4, 5.6);
		
		System.out.printf("#%6.2f#\n", 7.8);
		System.out.printf("#%-6.2f#\n", 7.8);
		System.out.printf("#%.2f#\n", 7.8);
		
		System.out.printf("%c %c %c\n", 's', 'k', 'y');
		System.out.printf("#%5c#\n", 'R');
		System.out.printf("#%-5c#\n", 'r');
		
		System.out.printf("%s %s %s\n", "Year", "Month", "Date");
		System.out.printf("#%8s#\n", "HAPPY");
		System.out.printf("#%-8s#\n", "HAPPY");
	}

}
