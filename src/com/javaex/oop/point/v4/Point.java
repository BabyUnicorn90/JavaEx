package com.javaex.oop.point.v4;

//v4. 상속 & overriding
public class Point {
	//field만들기
	protected int x;     //자식클래스에게 접근 권한을 허용하기 위
	protected int y;
	
	//생성자
	public Point(int x, int y) {
		System.out.println("Point의 생성자");
		
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
//		if (bDraw) {
//			message += "그렸습니다.";
//		} else {
//			message += "지웠습니다.";
//		}

		//삼항연산을 이용하여 간단하게 코드 작성하기: 
		//조건 ? 참일때 : 거짓일때 ;
		message += bDraw ? "그렸습니다.": "지웠습니다.";
		
		System.out.println(message);
	}
}
