package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println("p1 == p2 ? " + (p1 == p2)); //hashcode 비교
		
		System.out.println("p1.equals(p2)? " + p1.equals(p2));  //값 비교 --equals를 override 해줘야 함! 
		}

}
