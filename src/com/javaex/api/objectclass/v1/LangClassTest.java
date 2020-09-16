package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		//Java의 최상위 클래스는 Object!! --기본적으로 사용 가능
		System.out.println("객체정보: " + p.getClass().getName());
		
		System.out.println("객체 식별 정수: " + p.hashCode());  //기본적으로는 메모리 주소값 사용
		//cf) 참조타입의 ==은 hashcode를 비교하는 것! 
		
		System.out.println("toString: " + p.toString()); //문자열과 연결될 때, 출력시 문자열로 변환
		
		System.out.println("p 객체: " + p);

	}

}
