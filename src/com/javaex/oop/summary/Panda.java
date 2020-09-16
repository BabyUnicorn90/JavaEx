package com.javaex.oop.summary;

public class Panda extends Animal {
	//생성자
	public Panda(String name) {
		super(name);
	}
	
	
	@Override
	public void say() {
		System.out.println(name+ ": ...");

	}

}
