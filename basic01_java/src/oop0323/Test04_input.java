package oop0323;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test04_input {

	public static void main(String[] args) {
		String filename="I:/java202301/workspace/basic01_java/src/oop0323/data.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			int num =0;
			while (true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				System.out.printf("%d %s\n", ++num, line);
				if(num%20==0) {
					System.out.println("------------------------");
				}
				
			}
		} catch (Exception e) {
			System.out.println("파일 읽기 실패 : "+e);
		} finally {
			try {
				if(br!=null) {br.close();}
			} catch (Exception e) {}
			try {
				if(fr!=null) {fr.close();}
			} catch (Exception e) {}
		}
	}

}
