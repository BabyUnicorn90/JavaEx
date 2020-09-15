package com.javaex.oop.goods.v4;


//v4. 자신의 다른 생성자 호출
public class Goods {
	//필드선언
	private String name;     //기본필드
	private int price;       //기본필드
	private String option;   //부가필드
		
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
	
	public Goods(String name, int price, String option){
		this(name, price);      //자기의 다른 생성자 호출
		this.option = option;
	}
	
	//getter/setter 설정하기
	public String getName() {
		return name;
	}
	
	
	//setter가 없으면 해당 필드는 Read Only
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
	
	public String getOption() {
		return option;
	}
	
	public void setOption() {
		this.option = option;
	}
	
	// method
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		
		if (option != null) {
			System.out.println("옵션: " + option);
		}
	}
	
}
