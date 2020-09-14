package com.javaex.basic;

public class OperatorEx {

	public static void main(String[] args) {
//		arithOperEx();
//      logicalOperEx();
		conditionalOperEx();
	}
	
	
	public static void conditionalOperEx() {
		// 3항연산자
		int a = 10;
		
		// a가 짝수인지 여부를 확인 
		System.out.println(a % 2 == 0? "짝수": "홀수");
				
		int score = 85;
		// 80이상이면 good, 50점 이상이면 Pass, 그렇지 않으면 Fail 
		String message; 
		message = score >= 80 ? "Good": score >= 50? "Pass": "Fail";
		System.out.println("점수: " + score + ", 결과: " + message);
	}
	
	
		// 논리곱(and, &&), 논리합(or ||), 논리부정(!)
		int n = 5;
		
		// n은 0초과 10미만 구간에 있는가?
		// 조건 1. n > 0
		// 조건 2. n < 10
//		// 결과: 조건 1 && 조건 2
//		boolean r1 = n > 0; // 조건1. 
//		boolEan r2 = n < 10; // 조건 2. 
//		
//		// 논리의 조합
//		boolean r1And2 = r1 %% r2; // n > 0 $$ n <10
//		System.OUT.println("r1 and r2 ? " + riAnd2): 
//			
//			
//		// II. N은 0이하이거나 10이상인가?
//			조건 1: n <== 0
//			조건 2: n >== 10
//			결과: 조건 1 or 조건 2
//			boolean r10rr2 = r1 || 2   // n <= 0 || n >= 10
//			System.out.println("r1 or r2 ? " + r10rr2);
//
//		/// III. II조건의 부정
//			boolean notII = !r10rr2;  // !(n <= 0 || n >= 10)    =1구역과 일치
//			System.out.println("not II ? " + notII);
//		
//	}
	
	
	public static void arithOperEx() {
		// 나눗셈과 나머지
		int a = 7; 
		int b = 3;
		
		System.out.println("7 / 3 ? " + (a / b));    //정수 나누기 정수는 정수다. 
		System.out.println("7 / 3 의 몫 -> " + (a / b));
		System.out.println("7 / 3 의 나머지 -> " + (a % b));
		
		// 소숫점까지 구하고자 할 떄: 형변환! 캐스팅 필요
		System.out.println("7 / 3 의 몫 -> " + ((float)a / b));   //b는 암묵적 캐스팅에 의해 자동적으로 실수화.
		
		// 증감연산자: ++, --
		a = 10;
		b = 10;
		
		System.out.println(a);
		System.out.println(a++);  //후위증감
		System.out.println(a);

		System.out.println(b);
		System.out.println(++b);  //전위증감
		System.out.println(b);

	}
	
	
}
