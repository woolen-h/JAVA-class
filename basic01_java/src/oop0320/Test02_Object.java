package oop0320;


class Jeju{
	@Override
	public String toString() {
		return "제주도";
	}
}
class Suwon{
	private String id="itwill";
	private String pw="1234";
	@Override
	public String toString() {
	return "Suwon [id=" + id + ", password="+pw+"]";
	}
}
class Incheon{
	private String name="인천광역시";
	private String phone="123-4567";
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", phone=" + phone + "]";
	}}
class Seoul {}

public class Test02_Object {
	public static void main(String[] args) {
		// Object 클래스
		Jeju je=new Jeju();
		Suwon su=new Suwon();
		Incheon in=new Incheon();
		System.out.println(je.toString());
		System.out.println(su.toString());
		System.out.println(in.toString());
		Seoul se=new Seoul();
		System.out.println(se);
		se=null;
		System.out.println(se);
	}
}	
