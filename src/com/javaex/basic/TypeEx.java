package com.javaex.basic;

public class TypeEx {

	public static void main(String[] args) {
//		booleanEx();
//		integerTypesEx();
//      floatDoubleEx();
//		charEx();
//		constantEx();
//		implicitCastingEx();
		explicitCastingEx();
	}
	
	
	public static void explicitCastingEx() {
		// 명시적 형변환
		// 표현 범위가 넓은 자료형 -> 표현 범위가 좁은 자료형 
		// 데이터 유실이 발생할 수 있으므로 개발자가 강제로 변환 
		
		float f = 12345678.901234F;
		System.out.println(f);
		
		int i = (int)f;
		System.out.println(i);   //유실 발생
		
		short s = (short)i;
		System.out.println(s); 
		
		byte b = (byte)s;
		System.out.println(b);		
	}
	
	
	
	public static void implicitCastingEx() {
		// 암시적 형변환
		// 표현 범위가 좁은 자료형 -> 표현 범위가 넓은 자료형
		byte b = 25;   //1바이트 정수
		System.out.println(b);
		
		short s = b;  //2바이트 정수
		System.out.println(s);
		
		int i = s;   //4바이트 정수
		System.out.println(i);
		
		long l = i;  //8바이트 정수
		System.out.println(l);
		
		float f = l;  
		System.out.println(f);
		
		// 즉 자료형 표현범위가 byte < short < int < long < float < double 이므로 형변환 자유롭게 가능 		
	}
	
	
	
	public static void constantEx() {
		// 선언과 동시에 초기화, 한번 초기화되면 변경 불가 
		final double PI = 3.14159;    // 상수 식별자는 무조건 전부 대문자 
		final int SPEED_LIMIT = 110;  // 단어조합은 _로 연결 
		
		System.out.println("제한속도는 " + SPEED_LIMIT + "입니다."); 
		// 상수사용의 장점: 
		// 1. 코드 식별력 상승  2. 유지보수 용이
		
		// Java는 내부적으로 상수를 많이 활용.
		System.out.println("파이:" + Math.PI);		
	}
	
	
	
	public static void charEx() {
		// 2바이트 유니코드(부호 없음)
		char ch1 = 'A';   // ''
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);   // 정수형으로 변경되서 합산. 부적합. char형은 내부적으로는 수치화된 코드.		
	}
	
	
	public static void floatDoubleEx() {
		// 실수
		// float(4) < double(8)
		// 실수 표현 범위를 넓히고 정밀도를 포기한 것. 사용시 주의.
		float fVar = 3.14159F;  // 뒤에 F를 명시해줘야 실수로 인식.
		double dVar = 3.14159; 
		
		// 지수 표기법
		fVar = 3E-6F;   // 3 * 10 ^ -6
		dVar = 3E6;     // 3 * 10 ^ 6
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		// 정밀도체크 
		System.out.println(0.1 * 3);     // 정확한 값 아님. 사용시 주의.
	}
	
	
	
	public static void integerTypesEx( ) {
		// byte(1) < short(2) < int(4) < long(8)
		int intVal; // 선언
		intVal = 2020; // 할당(초기화)
//		int intVal2 = 1234567890234; // 범위초과
		
		
		long longVal1;  // 8byte
		long longVal2;
		longVal1 = 2020;
		longVal2 = 1234567890123L; // 뒤에 L을 붙여줘야 long으로 인식
		
		
		//표기법
		int bin, oct, hex;
		bin = 0b1100;   //2진수표기: 0b~
		oct = 072;      //8진수 표기: 0~
		hex = 0xFF;     //16진수 표기: 0x~ 
		
		System.out.println("2진수 0b1100 = " + bin);
		System.out.println("8진수 072 = " + oct);
		System.out.println("16진수 0xFF = " + hex);
	}
	
	

	public static void booleanEx() {
		// 논리형: 1byte - true or false
		boolean b1 = true; //참
		boolean b2 = false; //거짓 
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int val1 = 3;
		int val2 = 5;
		
		// 비교연산 or 논리연산을 수행하면 결과로 boolean 
		
		result = val1 < val2; // 3 < 5 ? 
		System.out.println("val1 < val2 ?");
	}


}
