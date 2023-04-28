package oop0322;

import java.util.Vector;

//상품 구매 관련 클래스
class Order {
	private int myMoney=1000; //나의 총 재산
	private int myMileage=0;  //나의 마일리지 점수(bonusPoint 누적)
	private int i=0;
	
	//상품을 구매했을때 어떤 상품을 구매했는지 저장 (나의 구매상품 목록)
	private Vector<Product> item=new Vector<>();
	
	public Order() {}
	
	public void buy(Product p) {
		
		if(this.myMoney<p.price) {
			System.out.println("잔액이 부족합니다!!");
			return;
		}//if end
		
		item.add(p); //구매상품 저장
		this.myMoney=this.myMoney-p.price;         //나의 재산은 감소
		this.myMileage=this.myMileage+p.bonusPoint;//나의 마일리지는 증가
		
	}//buy() end
	
	public void disp() {
		
		if(item.isEmpty()) {
			System.out.println("구매 상품 없음!!");
			return;
		}//if end
		
		//문제) 구매 상품 목록과 구매한 상품의 총 합계금액을 구하시오
		//     (item 벡터 활용)
		
		//구매한 상품 목록
		StringBuilder shoplist=new StringBuilder();
		
		//사용금액
		int hap=0;
		
		for(int n=0; n<item.size(); n++) {
			Product p=item.get(n);
			shoplist.append(p.toString()+" "); //상품명
			hap=hap+p.price;
		}//for end		
		
        System.out.println("구매 상품 목록 : " + shoplist);
        System.out.println("사용금액 : " + hap);
        System.out.println("나의 남은 재산 : " + this.myMoney);
        System.out.println("나의 마일리지 : "  + this.myMileage);
	}//disp() end
	
	
	public void refund(Product p) {
		if(item.remove(p)) {
			System.out.println(p.toString() + " 반품되었습니다~");
			this.myMoney  =this.myMoney+p.price;
			this.myMileage=this.myMileage-p.bonusPoint;
		}else {
			System.out.println("구매내역에 상품이 없습니다!!");
		}//if end
	}//refund() end
	
	
}//class end
