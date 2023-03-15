package oop0315;

public class Test05_main {
	public static void test() {
		System.out.println("JAVA");
		//test(); 재귀함수
		//main(); main 함수는 사용자 호출 불가
	}
	public static void main(String[] args) {
		// main 함수가 호출되는 시점과 값을 전달하는 예제
		
		test();
		/*
        default package에 있는 MainTest.java참조
        명령 프롬프트에서 실습합니다
         >cd\                    최상위 루트 이동
         >i:                     드라이브 변경
         >cd java202301          폴더 변경
         >cd workspace
         >cd basic01_java
         >cd src
         >dir
         >javac MainTest.java             자바소스 컴파일
         >java MainTest                   자바클래스 실행
         >java MainTest Seoul Jeju Busan
     
         ※.class파일 실행시 전달값은
            main()함수의 매개변수
            */
	}

}
