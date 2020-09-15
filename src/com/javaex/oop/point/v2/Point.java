package com.javaex.oop.point.v2;

//v2. 생성자
public class Point {
	//field만들기
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	//getter/setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//method
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
}
