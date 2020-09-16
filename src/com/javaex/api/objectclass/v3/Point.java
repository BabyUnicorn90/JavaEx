package com.javaex.api.objectclass.v3;

//object 클래스
//v3. Clone
public class Point implements Cloneable {   //복제 메서드를 활성화하려면 Cloneable 인터페이스 구현
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

	@Override   //정상적인 '값비교' 가능하도록
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point)obj;
			
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	//복제 메서드 구현
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제실패!" + e.getMessage());
		}
		
		return clone;
	}
	
}
