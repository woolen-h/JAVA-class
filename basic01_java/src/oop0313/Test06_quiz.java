package oop0313;

public class Test06_quiz {

	public static void main(String[] args) {
		// 연습문제
		double year=365.2422;
		int total=(int)(year*86400);
		//System.out.println(total);
		
		int day=total/86400;
		System.out.println(day+"일");
		
		total=total%86400;
		int hour=total/3600;
		System.out.println(hour+"시간");
		
		total=total%3600;
		int minute=total/60;
		System.out.println(minute+"분");
		
		int second=total%60;
		System.out.println(second+"초");
	}

}
