package com.javaex.oop.goods.v2;


//v2. 정보은닉  --field접근자를 private으로
public class Goods {
	//필드선언
	private String name;
	private int price;
	
	//getter/setter 설정하기
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//this --현재 인스턴스 그 자체
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// method
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
	
}
