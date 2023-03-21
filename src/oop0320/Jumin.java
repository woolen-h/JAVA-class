package oop0320;
import java.util.Calendar;

class Jumin {
private String juminno;
public Jumin() {}
public Jumin(String juminnno) {
	this.juminno=juminnno;
}
public boolean validate() {
	// 문) 주민번호가 맞으면 flag 변수값에 true를 대입하시오
	boolean flag = false;
    if (juminno == null || juminno.length() != 13) {
        return false;
    }
    int sum = 0;
    for (int i = 0; i < 12; i++) {
        sum += (juminno.charAt(i) - '0') * ((i % 8) + 2);
    }
    int check = (11 - (sum % 11)) % 10;
    if ((juminno.charAt(12) - '0') == check) {
        flag = true;
    }
    return flag;
	/*Integer[] CHECKNUM = {2,3,4,5,6,7,8,9,2,3,4,5};
	Integer[] save = new Integer[12];
	int hap = 0;
	int size = save.length;
	for (int i=0; i<size; i++) {
		int num = Integer.parseInt(juminno.substring(i,i+1));
		save[i]=num*CHECKNUM[i];
		hap=hap+save[i];
		int M=(11-(hap%11))%10;
		if(M==Integer.parseInt(juminno.substring(12))) {
			flag=true;
		}
		return flag;*/
	}
}
public void disp() {
	// 문) 생년월일, 성별, 나이, 띠 출력
	/*
	 * 생년원일 : 1989년 12월 30일
	 * 성별	:	남자
	 * 나이	:	35 >>> GregorianCalendar 이용
	 * 띠	:	태어난 연도%12 (0원숭이 1닭 2개 ~~ 11 양
	 * */
	// 생년월일 추출
    int year = Integer.parseInt(juminno.substring(0, 2));
    int month = Integer.parseInt(juminno.substring(2, 4));
    int day = Integer.parseInt(juminno.substring(4, 6));

    // 성별 추출
    String gender = "";
    if (juminno.charAt(6) == '1' || juminno.charAt(6) == '3') {
        gender = "남자";
    } else if (juminno.charAt(6) == '2' || juminno.charAt(6) == '4') {
        gender = "여자";
    }

    // 나이 계산
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int birthYear = Integer.parseInt(juminno.substring(0, 2));
    if (juminno.charAt(6) == '1' || juminno.charAt(6) == '2') {
        birthYear += 1900;
    } else {
        birthYear += 2000;
    }
    int age = currentYear - birthYear + 1;

    // 띠 계산
    String[] zodiacs = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
    int zodiacIndex = birthYear % 12;

    // 출력
    System.out.printf("생년월일: %d년 %d월 %d일\n", birthYear, month, day);
    System.out.printf("성별: %s\n", gender);
    System.out.printf("나이: %d\n", age);
    System.out.printf("띠: %s\n", zodiacs[zodiacIndex]);
    
    // 살아온 날 수
}
}

