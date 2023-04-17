package oop0317;
import java.lang.*;

public class Test02_wrapper {

	public static void main(String[] args) {
		// wrapper class
		// java.lang에 선언
		/*
		 * 기본형 boolean byte short int long float double char
		 * 참조형 Boolean Byte Short Integer Long Float Double Character*/
		boolean boo1 = true;
		Boolean boo2 = new Boolean("false");
		Boolean boo3 = true;
		
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		System.out.println(boo3.toString()); //"true"
		int in1=3;
		Integer in2=new Integer(5);
		Integer in3=7;
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in2.toString());
		System.out.println(in3.doubleValue());
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
		System.out.println(Integer.sum(2, 4));
		System.out.println(Integer.max(2, 4));
		System.out.println(Integer.min(2, 4));
		System.out.println(Integer.parseInt("123"));
		//System.out.println(Integer.parseInt("KOREA"));
		long lo1=3L;
		Long lo2=new Long(5);
		Long lo3=7L;
		double dou1=2.4;
		Double dou2=new Double("3.5");
		Double dou3=6.7;
		int hap = (int)dou1+dou2.intValue()+dou3.intValue(); 
		System.out.println(hap);
		char ch1='R';
		Character ch2='m';
		Character ch3= new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toLowerCase('R'));
		System.out.println(Character.toUpperCase('a'));
		
	}

}
