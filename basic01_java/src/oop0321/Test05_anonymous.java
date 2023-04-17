package oop0321;
interface IMessage{
	public void msgPrint();
}
class Message implements IMessage {
	@Override
	public void msgPrint() {
		// TODO Auto-generated method stub
	System.out.println("Message 클래스");	
	}
}
public class Test05_anonymous {

	public static void main(String[] args) {
		// 익명 내부 객체
		
		// IMessage msg = new IMessage(); 에러
		Message msg = new Message();
		msg.msgPrint();
		IMessage imess = new Message();
		imess.msgPrint();
		// $("button").click(){}
		IMessage mess = new IMessage() {
			
			@Override
			public void msgPrint() {
				// TODO Auto-generated method stub
			System.out.println("익명 내부 객체");	
			}
		};
		mess.msgPrint();
		System.out.println(mess);
	}

}
