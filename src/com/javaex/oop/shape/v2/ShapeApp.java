package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		Drawable[] Objects = new Drawable[4];
		
		Circle c1 = new Circle(10, 20, 10);
		Rectangle r1 = new Rectangle(20, 10, 20, 30);
		Rectangle r2 = new Rectangle(0, 0, 40, 50);
		Point p1 = new Point(20, 30);
		
		Objects[0] = c1;
		Objects[1] = r1;
		Objects[2] = r2;
		Objects[3] = p1;    //p1은 shape가 아니니까 에러 --참조타입 바꿔주기 
		
		for (Drawable obj: Objects) {
			if (obj != null) 
				obj.draw();	
		}
	}
}
