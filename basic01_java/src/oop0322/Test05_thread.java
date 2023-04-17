package oop0322;

import java.security.PublicKey;

class MyThread1 {
	private int num;
	private String name;
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public void start() {
		
	}
	public void run() {
		for(int a=0; a<num; a++) {
			System.out.println(name+":"+a);
		}
	}
	
}
public class Test05_thread {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1(1000, "⁕");
		MyThread1 t2=new MyThread1(1000, "⁕⁕");
		MyThread1 t3=new MyThread1(1000, "⁕⁕⁕");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
