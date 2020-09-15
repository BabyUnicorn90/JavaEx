package com.javaex.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringEx();
		stringFormatEx();
	}

	public static void stringFormatEx() {
		//%d(정수), %s(문자열), %n(개행), %f(실수), %%(%)
		
		//OO개의 OO중에서 OO개를 먹었다.
		String fmt = "%d개의 %s중에서 %d개를 먹었다.%n";
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		String result = String.format(fmt, total, fruit, eat);
		System.out.println(result);  
		System.out.printf(fmt, 10, "오렌지", 5);  //.printf 메서드의 사용법
		
		
		//%f 
		float rate = 1.234f;
		//현재 이자율: 0.00%입니다. 
		System.out.printf("현재 이자율은 %f%%입니다.%n", rate);
		System.out.printf("현재 이자율은 %.3f%%입니다.%n", rate); //%.3f --소수점아래 자리수를 3자리로 제한
		
	}
	
	public static void stringEx() {
		//문자형 선언
		String str; //선언
		str = "Java"; //할당: literal
		String str2 = "Java"; //literal
		String str3 = new String("Java");
		
		//세 변수는 모두 같은 데이터? 
		System.out.println(str == str2);   //literal == literal  --T
		System.out.println(str2 == str3);  //literal == new객체   --F; new객체는 HEAP Memory(새 주소를 갖는다).
		//즉, 참조변수는 주소 값을 저장하고 있다.
		
		//참조변수의 데이터의 동일성을 비교. (값비교) --.equals()메서드 사용 
		System.out.println(str.equals(str2));    // --T
		System.out.println(str2.equals(str3));   // --T
		
	}
	
	
}
