package oop0321;

public class Test07_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바 클래스 실행 시 발생하는 에러*/
		// 1) 예외처리 X
		/*System.out.println(1);
		System.out.println(3);
		System.out.println(5);
		System.out.println("END");*/
		// 2) 예외처리 O
		/*try {
			// 예외발생 예상
			System.out.println(1);
			System.out.println(3/0);
			System.out.println(5);
		} catch(ArithmeticException e) {
			// 예외발생 시 처리
			System.out.println(e);
		} //
		System.out.println("END");*/
		
		// 3)
		/*try {
			System.out.println(1);
			int[] num = new int[3];
			num[5]=7;
			System.out.println(9);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("END");*/
		// 4)
		/*try {
			System.out.println(1);
			int num = Integer.parseInt("KOREA");
			System.out.println(num);
			System.out.println(3);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("END");*/
		// 5)
		/*try {
			System.out.println(1);
			Integer inte=null;
			System.out.println(5/inte);
		} catch (NullPointerException e) {
			System.out.println(e);
		}*/
		// 6) 다중 catch
		/*try {
			int a=2/0;
			int b= Integer.parseInt"KOREA")
			int[] num= new int[3];
			num[5]=7;
			} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("END");*/
		
		// 7)
		/*try {
			int a=2/0;
			int b= Integer.parseInt("KOREA");
			int[] num= new int[3];
			num[5]=7;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("END");*/
		// 8) finally 문
		try {
			System.out.println("OPEN");
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("CLOSE");
		}
		System.out.println("END");
	}//main end

}//class end
