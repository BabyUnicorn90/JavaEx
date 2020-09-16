package com.javaex.oop;

//설계도로서만 의미가 있다. (=실체화(구현)할 필요가 없음) --추상클래스로 만드는 것이 낫다!
//추상클래스: 스스로 new로 인스턴스화 할 수 없다.

//upcasting & downcasting 연습
public class Animal {
	//필드
	protected String name;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//메서드
	public void eat() {
		System.out.println(name + "이 먹고있습니다.");
	}
	
	public void walk() {
		System.out.println(name + "이 산책합니다.");
	}

}
