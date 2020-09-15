package com.javaex.oop.staticmember;

//어떤 상황에서든지 단 하나의 instance 유지해야하는 경우:
public class Singleton {
	private static Singleton instance = new Singleton();
	
	//생성자 --new를 통해 instance를 만들수 있다는 말이므로 생성자 접근을 막아준다. 
	private Singleton() {	
	}
	
	//getter로 우회
	public static Singleton getInstance() {
		return instance;
	}
}
