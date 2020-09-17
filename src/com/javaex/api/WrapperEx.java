package com.javaex.api;

public class WrapperEx {

	//Wrapper 클래스
	//기본 타입을 포장하여 객체화 시키는 클래스
	//여러 자바 클래스에서는 '객체'만 처리하는 경우가 많기 때문에 Wrapper Class가 필요.
	//변환 등 부가적인 유틸리티메서드 활용 可
	public static void main(String[] args) {
		//생성
		Integer i = Integer.valueOf(2020); 
		
		//타 데이터타입을 변환하는 과정에서도 사용 可
		Integer i2 = Integer.valueOf("2020");   //str -> int객체로 변환
		
		//주의: 인수의 형태가 해당타입으로 변환가능한 데이터타입이어야 한다. 
		
		//
		//자동박싱지원
		Integer i3 = 10; //Integer i3 = Ingeger.valueOf(10) 
		
		//parse 계열 메서드: 문자열을 이용해서 해당 타입으로 변환
		System.out.println(Integer.parseInt("-123"));        
		System.out.println(Integer.parseInt("FF", 16));    //진법변환
		System.out.println(Integer.toBinaryString(2020));    //진법변환
		
		//형변환
		System.out.println(i.doubleValue());  // Integer -> double형으로 추출
		
		//포장된 값의 비교
		System.out.println(i == i2);  //  --F (∵다른객체)
		
		//언박싱 비교
		System.out.println(i.intValue() == i2.intValue());   // --T
		System.out.println(i.equals(i2));                    // --T
	}

}
