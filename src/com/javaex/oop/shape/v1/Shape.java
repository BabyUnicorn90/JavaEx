package com.javaex.oop.shape.v1;

//추상클래스. 실체화 X 
public abstract class Shape {
	//field
	protected int x;
	protected int y;
	
	//생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상메서드: 실체클래스에서 반드시 구현을 강제한다. 
	public abstract double area();
	public abstract void draw();
}
