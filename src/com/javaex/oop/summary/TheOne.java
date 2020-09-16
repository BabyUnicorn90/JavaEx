package com.javaex.oop.summary;

//인터페이스는 여러 개 implement할 수 있다. 
public class TheOne extends Human implements Flyable, Kungfu {
	//생성자
	public TheOne(String name) {
		super(name);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know Kungfu!");

	}

	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly~");

	}

}
