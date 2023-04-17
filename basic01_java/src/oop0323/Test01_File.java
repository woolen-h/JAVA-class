package oop0323;

import java.io.File;

public class Test01_File {

	public static void main(String[] args) {
		// file 클래스
		try {
			String pathName = "I:\\java202301\\doc\\20230309_java.pdf";
			File file = new File(pathName);
			if(file.exists()) {
				System.out.println("파일 O");
				long filesize = file.length();
				System.out.println("파일크기 : "+filesize);
				System.out.println("파일크기 : "+filesize/1024+"KB");
				System.out.println("파일크기 : "+filesize/1024/1024+"MB");
				
				int lastdot = filename.lastIndexof(".");
				String name = filename.substring(0, lastdot);
				String ext = filename.substring(lastdot+1);
				System.out.println("파일명 : "+name);
				System.out.println("확장명 : "+ext);
				
				/*if(file.delete()) {
					System.out.println(filename + "파일이 삭제되었습니다.");
				} else {
					System.out.println(filename + "파일 삭제 실패");
				}//if
				
			}else {
				System.out.println("파일 없음");*/
			}
		} catch (Exception e) {
			System.out.println(e);
		}//t/c end
		System.out.println("END");
	}//main

}//class
