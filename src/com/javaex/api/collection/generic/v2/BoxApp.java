package com.javaex.api.collection.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		//박스를 만드고, 데이터 세팅
		Box<Integer> intBox = new Box<>();
		intBox.setContent(2020);
//		intBox.setContent("Java");  //컴파일러가 체크
		
		//값 꺼내기
		int retVal = (int)intBox.getContent(); //캐스팅 필요 (∵Object)
		System.out.println("내용물: " + retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");  //에러 --Box 모듈에 데이터타입 변환 필요 --object로 바꾸면 intBox.getContent();에서 에러
		
		//강제 캐스팅 등은 위험요소. -Generic을 이용하면 안전하고 캐스팅 필요없어서 편리.
		String content = strBox.getContent();
		System.out.println("strBox의 내용물: " + content);
	}
}
