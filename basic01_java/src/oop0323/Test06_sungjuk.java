package oop0323;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
public class ExamScore {
    private String name;    // 이름
    private int kor;        // 국어 점수
    private int eng;        // 영어 점수
    private int math;       // 수학 점수
    private int average;    // 평균
    private int rank;       // 등수
    private String result;  // 결과

    // 생성자
    public ExamScore(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.average = (kor + eng + math) / 3;
    }

    // getter 메소드
    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getAverage() {
        return average;
    }

    public int getRank() {
        return rank;
    }

    public String getResult() {
        return result;
    }
    
    public boolean isPassed() {
        return (kor >= 60 && eng >= 60 && math >= 60);
    }

    public boolean isScholarship() {
        return (average >= 95);
    }

    // setter 메소드
    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
public class Test06_sungjuk {

	public static void main(String[] args) {
		// 문 성적프로그램
		// 성적 입력자료를 가져와서 결과 파일 완성
		/*
		 * 입력 데이터 파일 : sungjuk.txt
		 * 결과 파일 : result.txt
		 * 성 / 적 / 결 /과
              -------------------------------------------------------
              이름     국어   영어  수학   평균  등수   결과
              -------------------------------------------------------                       
              라일락    100  100  100   100   1    합격 ********** 장학생
              진달래     50   55   60    55   4    불합격 *****
              개나리     95   95   35    75   3    재시험 *******
              무궁화     80   85   90    85   2    합격 ********
              홍길동     60   40   30    43   5    불합격 ****
              ------------------------------------------------------
		 * */
		String inName = "I:/java202301/sungjuk.txt";
		String outName = "I:/java202301/result.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter out = null;
		try {
            // 입력 파일 열기
            fr = new FileReader(inName);
            br = new BufferedReader(fr);
            // 결과 파일 열기
            fw = new FileWriter(outName);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);

            // 제목 출력
            out.println("성 / 적 / 결 / 과");
            out.println("-------------------------------------------------------");
            out.println("이름\t국어\t영어\t수학\t평균\t등수\t결과");
            out.println("-------------------------------------------------------");

            // 성적 정보 읽어서 리스트에 저장
            List<ExamScore> list = new ArrayList<ExamScore>();
            String line = null;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                String name = st.nextToken();
                int kor = Integer.parseInt(st.nextToken());
                int eng = Integer.parseInt(st.nextToken());
                int math = Integer.parseInt(st.nextToken());
                ExamScore score = new ExamScore(name, kor, eng, math);
                list.add(score);
            }

            // 평균으로 정렬
            Collections.sort(list, (s1, s2) -> s2.getAverage() - s1.getAverage());

            // 등수 계산
            for (int i = 0; i < list.size(); i++) {
                ExamScore score1 = list.get(i);
                int rank = 1;
                for (int j = 0; j < list.size(); j++) {
                    if (i == j)
                        continue;
                    ExamScore score2 = list.get(j);
                    if (score1.getAverage() < score2.getAverage())
                        rank++;
                    else if (score1.getAverage() == score2.getAverage() && i > j)
                        rank++;
                }
                score1.setRank(rank);
            }

            // 결과 출력
            for (ExamScore score : list) {
                out.print(score.getName() + "\t");
                out.print(score.getKor() + "\t");
                out.print(score.getEng() + "\t");
                out.print(score.getMath() + "\t");
                out.print(score.getAverage() + "\t");
                out.print(score.getRank() + "\t");
                if (score.isPassed()) {
                    out.print("합격");
                    if (score.isScholarship()) {
                        out.print(" ********** 장학생");
                    }
                } else {
                    out.print("불합격");
                    for (int i = 0; i < score.getAverage() / 10; i++) {
                        out.print(" *");
                    }
                }
                out.println();
			
		}} catch (Exception e) {
			System.out.println("성적 프로그램 읽고, 쓰기 실패 : "+e);
		} finally {
			try {
			if(br!=null) {br.close();}	
			} catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}	
			} catch (Exception e) {}
			try {
				if(out!=null) {out.close();}
			} catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			} catch (Exception e) {}
		}//try

	}//main

}//class
