package com.javaex.oop.shape.v1;

public class Circle extends Shape {   //추상클래스를 상속받았는데 추상메서드가 적히지 않으면 에러
	//field
	protected double radius; 
	
	//생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//추상클래스를 상속받은 실체 클래스는 추상메서드를 반드시 구현
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);	
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%f]을 그렸어요.%n", x, y, area());
	}	
}
