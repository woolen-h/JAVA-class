package oop0322;
class MyThread3 extends Thread {
	private int num;
	private String name;
	public MyThread3() {}
	public MyThread3(int num, String name) {
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
public class Test07_thread {

	public static void main(String[] args) {
		// 
		Thread t1 = new Thread(new MyThread3(1000,"★"));
		Thread t2 = new Thread(new MyThread3(1000,"★"));
		Thread t3 = new Thread(new MyThread3(1000,"★"));
			
		t1.start();
		t2.start();
		t3.start();

	}//main

}//class
