package oop0323;

import java.io.FileInputStream;

public class Test02_input {

	public static void main(String[] args) {
		// 파일 입출력(.txt)
		
		String filename="I:/java202301/workspace/basic01_java/src/oop0323/data.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			while (true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.printf("%c", data);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// 자원반납
			try {
				if(fis!=null) {fis.close();}
			} catch (Exception e) {
				
			}
		}//try
	}//main

}//class
