package oop0314;

public class Test02_quiz {

	public static void main(String[] args) {
		//문1)알파벳을 아래와 같이 한줄에 5개씩 출력하시오
        /*
        ABCDE
        FGHIJ
        KLMNO
        PQRST
        UVWXY
        Z
    */
	
		        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		        int count = 0;
		        for (int i = 0; i < alphabet.length(); i++) {
		            System.out.print(alphabet.charAt(i));
		            count++;
		            if (count == 5) {
		                System.out.println();
		                count = 0;
		            }
		        }
		        
		//문2)아래와 같이 출력하시오
        /*
            ####
             ###
              ##
               #
        */
		        int n = 4;
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("#");
		            }
		            System.out.println();
		        }
	
		//문3)다음식의 결과값을 구하시오
        /*
               1   2   3   4   5      99
               ─ - ─ + ─ - ─ + ─ ...  ──   = 0.688172
               2   3   4   5   6      100
        */
		        double hap = 0.0;
		        for (int i = 1; i <= 99; i++) {
		            if (i % 2 == 1) { // i가 홀수이면 빼기
		                hap -= (double)i / (i + 1);
		            } else { // i가 짝수이면 더하기
		                hap += (double)i / (i + 1);
		            }
		        }
		        System.out.println(hap);
		        
		//문4)아래와 같이 계산해서 출력하시오
        /*    
             1+....+10=55
            11+....+20=155
            21+....+30=255

            81+....+90=
            91+....+100=955   
        */

		        int sum = 0;
		        for (int i = 1; i <= 100; i++) {
		            sum += i;
		            if (i % 10 == 0) { // 10개씩 묶어서 출력
		                System.out.println((i - 9) + "+....+" + i + "=" + sum);
		                sum = 0;
		            }
		        }
		        // 마지막 묶음 출력
		        System.out.println("81+....+90=" + (81 + 82 + 83 + 84 + 85 + 86 + 87 + 88 + 89 + 90));
		        System.out.println("91+....+100=" + (91 + 92 + 93 + 94 + 95 + 96 + 97 + 98 + 99 + 100));
		//문5)어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
        //   달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오

		        int height = 13; // 나무의 높이
		        double up = 3.0; // 낮에 올라가는 높이
		        double down = 2.5; // 밤에 내려오는 높이
		        int days = 0; // 걸리는 일수
		        double distance = 0; // 달팽이가 이동한 거리

		        while (distance < height) {
		            days++; // 하루가 지남
		            distance += up; // 낮에 올라감
		            if (distance >= height) { // 꼭대기에 도달하면 종료
		                break;
		            }
		            distance -= down; // 밤에 내려감
		        }

		        System.out.println("나무 꼭대기에 도달하는 데 " + days + "일이 걸립니다.");
		    }}
		        
		        