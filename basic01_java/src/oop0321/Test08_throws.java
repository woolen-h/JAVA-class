package oop0321;
class Test{
	// try문 각각 적용
	/*public void view() {
		try {
			int a=3/0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void disp() {
		try {
			int a=Integer.parseInt("KOREA");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}*/
	// throws
	public void view() throws Exception {
		int a = 3/0;
	}
	public void disp() throws NullPointerException, NumberFormatException {
		int a = Integer.parseInt("KOREA");
	}
	public synchronized void login() {
		
	}
}
public class Test08_throws {

	public static void main(String[] args) {
		// throws : 예외처리 한꺼번에
		try {
			Test test = new Test();
			test.view();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
