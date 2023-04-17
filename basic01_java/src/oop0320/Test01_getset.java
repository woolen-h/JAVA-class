package oop0320;

public class Test01_getset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BbsDTO dto=new BbsDTO();
		dto.setBbsno(1);
		dto.setWrite("오필승");
		dto.setSubject("무궁화");
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWrite());
		System.out.println(dto.getSubject());
	}

}
