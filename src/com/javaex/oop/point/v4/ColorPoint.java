package com.javaex.oop.point.v4;


//v4. Point클래스를 상속받은 자식클래스
public class ColorPoint extends Point {
	private String color;
	
	//생성자
	public ColorPoint(int x, int y) {
		//생성자를 특별히 명시하지 않으면 javac가 부모의 기본생성자를 임의로 추가한다.
		super(x, y);   //그래서 명시적으로 부모 생성자를 호출함.  --super()
		System.out.println(this.getClass().getSimpleName() + "의 생성자(x,y)");
	}
	
	public ColorPoint(int x, int y, String color) {
		 this(x, y);
		 this.color = color;
		 System.out.println(this.getClass().getSimpleName() + "의 생성자(x,y,color)");
	}

	//Getter/Setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//부모Point는 draw메서드를 가지고 있는 상태.
	@Override
	public void draw() {
		if (color != null) {
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
//					x, y, color);   //부모의 private이라 에러발생
			
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
//			super.getX(), super.getY(), color);   //해결방법 1. getter이용 우회접근
			
			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
			x, y, color);   //해결방법 2. 부모의 필드를 protected로 변경
		}else {
			System.out.printf("색깔점[x=%d, y=%d]을 그렸습니다.", x, y);
		}
		
	}

	@Override
	public void draw(boolean bDraw) {
		//연습: Point클래스의 draw(boolean)메서드를 오버라이드
		super.draw(bDraw);
	}
	
	

}
