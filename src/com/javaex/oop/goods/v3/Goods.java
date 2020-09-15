package com.javaex.oop.goods.v3;


//v3. 필드를 Read Only로 변경 + 생성자 추가
public class Goods {
	//필드선언
	private String name;
	private int price;
	
	
	
	//생성자: new키워드로 실행
	//      객체 초기화 담당
	//      생성자가 하나도 없으면 자바 컴파일러가 기본 생성자를 임의로 추가
	
	//기본생성자
//	public Goods() {
//		
//	}
	
	//사용자정의 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	//getter/setter 설정하기
	public String getName() {
		return name;
	}
	
	
	//setter가 없으면 해당 필드는 Read Only
//	public void setName(String name) {
//		//this --현재 인스턴스 그 자체
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// method
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
	
}
