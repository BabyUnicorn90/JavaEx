package com.javaex.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		defineArray();
//		twoDimenEx();
//		arrayCopyEx();
		arrayCopySystem();
	}

	
	public static void arrayCopySystem() {
		//System.arraycopy() 메서드를 이용한 배열복사하기 
		
		int src[] = {1, 2, 3};
		int tgt[] = new int[10];
		
		System.arraycopy(src, 0,     //원본 배열의 복사 시작 위치 
				tgt, 0,              //새 배열의 복사 시작 위치
				src.length);         //복사할 길이
		
		//Enhanced for
		for (int num: tgt) {
			System.out.printf("%d\t", num);
		}
		
		System.out.println();
	}
	
	
	
	public static void arrayCopyEx( ) {
		//배열의 단점: 한번 생성되면 크기 변경 불가 
		//배열의 추가 공간 필요 or 삭제시: 새 배열 작성 후 기존배열 복사-붙여넣기
		
		int src[] = {1, 2, 3}; 
		//if 7개의 공간이 추가로 필요하다면: 
		//1. 새 배열 만들기
		int tgt[] = new int[10];
		
		//2. 기존배열 복사하기
		for (int i = 0; i < src.length; i++) {
			tgt[i] = src[i];
		}
		
		//3. 
		for (int i = 0; i < tgt.length; i++) {
			System.out.printf("%d\t", tgt[i]);
		}
		
		//4. 확인
		System.out.println();
	}
	
	
	
	
//	public static void twoDimenEx() {
//		//2차원 배열의 선언 -배열의 배열
//		int [][] twoDimen = new int[5][10]; //5행10열의 배열
//		
//		//기본데이터가 있을 때:
//		int table[][] = {
//			{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
//			{2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
//			{3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
//			{4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
//			{5, 6, 7, 8, 9, 0, 1, 2, 3, 4}
//		};
//		
//		//table length 확인하기 (행)
//		System.out.println("table length: " + table.length);    
//		
//		//인덱스 접근범위: table[0] ~ table[table.length - 1] (열)
//		System.out.println("table[0] length:" + table[0].length);
//		
//		//배열 내 모든 요소값 합산
//		int sum = 0;
//		for (int i = 0; i < table.length; i++) {    // 행 루프
//			for (int j = 0; j < table[i].length; j++) //열 루프
//				System.out.print(table[i][j] + "\t");
//				sum += table[i][j];
//		}
//		
//		System.out.println();
//	}
//	
	
	
	public static void defineArray() {
		//배열을 선언하는 방법
		String[] name;  //1. type[]
		int scores[]; //2. 식별자[]
		
		//초기화
		name = new String[] {
				"김", "이", "박", "최"
		};
		
		scores = new int[4]; //빈 배열 생성
		
		//인덱스 접근
		//인덱스 범위: 0 ~ length-1  -----주의!
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;     //인덱스 범위 초과 --접근할 수 없음
				
		//
		//미리 값 목록이 있을 경우 배열 선언하기 
		int age[] = {
			28, 30, 25, 32	
		};
		
		//배열의 길이: .length 속성으로 확인 
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%d세) - %d점%n",
					name[i], age[i], scores[i]);
		}
				
		
		//
		//참조형 자료형 주의점: 참조형은 메모리 주소를 담고있다.
		int[] scores2 = scores;
		System.out.println(scores == scores2);  //참조형에서 ==는 객체비교(주소비교)   --T
		
		System.out.println("scores[2] ->" + scores[2]);
		System.out.println("scores2[2] ->" + scores2[2]);
		
		scores2[2] = 100;
		
		System.out.println("scores[2] ->" + scores[2]);
		System.out.println("scores2[2] ->" + scores2[2]);
	}
	
	
	
	
	
	
}
