package oop0315;

import java.util.GregorianCalendar;

import org.w3c.dom.css.Counter;

public class Test07_constructor {

	public static void main(String[] args) {
		// 생성자 함수 : 클래스명과 동일한 함수 (new연산자와 함께 메모리 할당)
		// 오버로드가 가능
		
		// 소멸자 함수(Destructor) > 자바에 엄슴
		// 가비지 콜렉팅 (JVM이 자동 메모리 회수)
		
		GregorianCalendar today = new GregorianCalendar(); // 생성자 함수의 예
		if (today.isLeapYear(2023)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		//서기 1년~서기 2023년 까지 윤년의 개수를 구하시오.
		int count = 0;

        for (int year = 1; year <= 2023; year++) {
            if (today.isLeapYear(year)) {
                count++;
            }
        }

        System.out.println(count);
        // 공식 2
		int count2 = 0;

        for (int year1 = 1; year1 <= 2023; year1++) {
            if (year1%4==0 && year1%100!=0 || year1%400==0) {
                count2++;
            }
        }

        System.out.println(count2);
        
	}

}

