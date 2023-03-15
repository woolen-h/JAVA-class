package oop0315;

public class Test04_quiz {
	public static double sd(int[] aver) {
		int size = aver.length;
		//1) 누적의 합 
		double hap = 0.0;
		for(int i=0; i<size; i++) {
			hap = hap + aver[i];
		}
		// aver 요소의 평균
		double avg = hap / size;
		
		double sum = 0.0;
		for(int i = 0; i<size; i++) {
			// aver의 avg 값과의 차이
			double d = aver[i] - avg;
			//2) 양수로 변환
			d = Math.abs(d);
			// 편차 모두 더함
			sum = sum+d;
		}
		//3) 표준편차
		return sum / size;
	}
	/*public static double sd(int[] arr) {
	    double sum = 0.0;
	    double mean = 0.0;
	    double sd = 0.0;
	    int length = arr.length;

	    // 평균값 계산
	    for (int num : arr) {
	        sum += num;
	    }
	    mean = sum / length;

	    // 표준편차 계산
	    for (int num : arr) {
	        sd += Math.pow(num - mean, 2);
	    }
	    return Math.sqrt(sd / length);
	}*/
	
	public static void main(String[] args) {
		// 문제) 표준편차(Standard deviation) 구하기
		
		int[] aver = {85,90,93,86,82};
		double result = sd(aver);
		System.out.printf("표준편차 : %.2f", result);
		/*
		 * 1) aver의 평균을 구하고 각 요소에서 평균값을 뺀다.
		 * 2) 1의 값을 양수로 변환
		 * 3) 편차들의 평균값 */
		
		
	}

}
