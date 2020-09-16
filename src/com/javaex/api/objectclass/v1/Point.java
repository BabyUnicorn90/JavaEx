package com.javaex.api.objectclass.v1;

//object 클래스
//v1. toString 오버라이드
public class Point {
	//field만들기
	protected int x;     //자식클래스에게 접근 권한을 허용하기 위
	protected int y;
	
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
	
	//method overloading
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을", x, y);
		message += bDraw ? "그렸습니다.": "지웠습니다.";
		
		System.out.println(message);
	}

	@Override
	public String toString() {
		//문자열 형식 반환
		return String.format("Point(%d, %d)", x, y);
	}
	
	
}
