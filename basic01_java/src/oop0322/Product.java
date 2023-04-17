package oop0322;

class Product extends Object {
public int price;
public int bonusPoint;

public Product () {}
public Product(int price) {
	this.price = price;
	this.bonusPoint = (int)(price*0.1);
	
}
}
class SmartTV extends Product {
	public SmartTV() {
		super(100); // 상품가격
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "스마트TV";
	}
}
class Notebook extends Product {
	public Notebook() {
		super(200); // 상품가격
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "노트북";
	}
}
class HandPhone extends Product {
	public HandPhone() {
		super(150); // 상품가격
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "핸드폰";
	}
}