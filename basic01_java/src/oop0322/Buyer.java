package oop0322;

class Buyer {private int myMoney = 1000;
private int myMileage = 0;
private int i = 0;

Product[] item = new Product[10];

public Buyer() {}

public void buy(Product p) {
    if (this.i >= item.length) {
        System.out.println("더 이상 구매할 수 없습니다.");
        return;
    }
    this.item[this.i++] = p;
    this.myMoney -= p.price;
    this.myMileage += p.bonusPoint;
    System.out.println(p + "를 구매했습니다.");
}

public void disp() {
    StringBuffer shoplist = new StringBuffer();
    int hap = 0;
    for (int n = 0; n < i; n++) {
        shoplist.append(item[n].toString() + " ");
        hap += item[n].price;
    }
    System.out.println("구매 상품 목록 : " + shoplist);
    System.out.println("사용금액 : " + hap);
    System.out.println("나의 남은 재산 : " + this.myMoney);
    System.out.println("나의 마일리지 : " + this.myMileage);
}
}
