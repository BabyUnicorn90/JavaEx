package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//벡터 생성
		Vector<Integer> v = new Vector<>();
		
		//버퍼기반의 가장 원초적인 리스트 형태 
		System.out.println("Size: " + v.size() + ", 버퍼공간: " + v.capacity());
		
		//1부터 10까지 값 담기
		for(int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println("Size: " + v.size() + ", 버퍼공간: " + v.capacity());
		
		//허용량 초과해보기
		v.addElement(11);    //v.addElement(Integer.valueOf(11));
		System.out.println("Size: " + v.size() + ", 버퍼공간: " + v.capacity());   //버퍼는 자동으로 늘어난다!
		
		//중간에 값 넣기
		v.insertElementAt(5, 7);
		System.out.println("Vector: " + v);
		
		//인덱스의 값을 조회: elementAt
		System.out.println("5번 인덱스의 객체: " + v.elementAt(5));
		
		//객체의 검색: indexOf()
		System.out.println("7 객체의 인덱스: " + v.indexOf(7));
		System.out.println("없는 객체의 인덱스: " + v.indexOf(0));
		
		//객체 포함여부: contains()
		System.out.println("v는 10을 갖고 있습니까? " + v.contains(10));
		
		//객체 삭제: remove
		v.remove(10);
		System.out.println("10 객체 삭제 후: " + v);
		System.out.println("10 객체 삭제 후 v는 10을 갖고 있습니까? " + v.contains(10));
		
		//루프
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.printf("%d번요소 %d%n", i, item);
		}
		
		//[★] Enumeration: 추천
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer item = e.nextElement();
			System.out.println(item);
		}
		
		//Generics 활용
		Vector<? super Number> v2 = new Vector<>();
		
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("Java");  //String은 Number의 후손이 아니다! 
		
		
	}

}
