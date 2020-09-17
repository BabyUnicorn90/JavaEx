package com.javaex.api.collection.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		//박스를 만드고, 데이터 세팅
		Box intBox = new Box();
		intBox.setContent(2020);
		
		//값 꺼내기
		int retVal = (int)intBox.getContent();
		System.out.println("내용물: " + retVal);
		
		Box strBox = new Box();
		intBox.setContent("Java");  //에러 --Box 모듈에 데이터타입 변환 필요 --object로 바꾸면 intBox.getContent();에서 에러
		
		//강제 캐스팅 등은 위험요소.
		String content = (String)strBox.getContent();
		System.out.println("strBox의 내용물: " + content);
	}
}
