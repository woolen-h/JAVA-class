package oop0322;
class MyThread2 extends Thread {
	private int num;
	private String name;
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}//end
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int a=0; a<num; a++) {
			System.out.println(name+":"+a);
		}//for
	}//run
	
}//class end


public class Test06_thread {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2(1000, "⁕");
		MyThread2 t2=new MyThread2(1000, "⁕⁕");
		MyThread2 t3=new MyThread2(1000, "⁕⁕⁕");
		
		t1.start();
		t2.start();
		t3.start();

	}//main

}//thread
