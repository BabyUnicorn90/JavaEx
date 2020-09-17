package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void main(String[] args) {
//		basicSort();
//		basicReverseSort();
//		customSort();
//		searchEx();
		arrayCopyEx();
	}
	
	
	private static void arrayCopyEx() {
		//복사
		char src[] = "Java Programming".toUpperCase().toCharArray();
		System.out.println("원본 배열: " + Arrays.toString(src));
		
		//System을 이용한 복제
		char target[] = new char[src.length];
		System.arraycopy(src, 0,    //원본 복사 시작 인덱스
				target, 0,          //대상 배열 복사 시작 인덱스
				src.length);        //복사할 길이
		
		System.out.println("System copy: " + Arrays.toString(target));
		
		//Arrays.copyOf
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf: " + Arrays.toString(target));
		
		//일부 복제: Arrays.copyOfRange
		target = Arrays.copyOfRange(src, 5, 12);
		System.out.println("Arrays.copyOfRange: " + Arrays.toString(target));
	}
	
	
	private static void searchEx() {
		int nums[] = {2, 7, 4, 2, 1, 9, 10, 15, 7};
		
		//search
//		int index = Arrays.binarySearch(nums, 4); //2가 출력되어야 한다. 
//		System.out.println("4의 인덱스: " + index); //자바는 기본적으로 binary search 알고리즘으로 구현되기 떄문에 검색 전에 sort 필요
		
		//sort
		Arrays.sort(nums);
		
		//sort 후 search
		int index = Arrays.binarySearch(nums, 4); //2가 출력되어야 한다.
		System.out.println("소트된 배열: " + Arrays.toString(nums));
		System.out.println("4의 인덱스: " + index); 
		
		
		//사용자 정의 객체의 검색: Comparable 구현 필요
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정")
		};
					
		//sort
		Arrays.sort(members);
		System.out.println("소트된 배열: " + Arrays.toString(members));
		
		index = Arrays.binarySearch(members, new Member("홍길동")); //객체를 찾아야 한다!
		System.out.println("홍길동의 인덱스: " + index);
	}
	
	
	//사용자정의 객체(사용자정의 생성자)의 배열
	private static void customSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정")				
		};
		
		//원본배열 출력
		System.out.println("원본배열: " + Arrays.toString(members));
		
		//sort
		Arrays.sort(members);
		System.out.println("정렬 결과: " + Arrays.toString(members));  //에러 
		//∵사용자정의 클래스에서는 두 객체의 필드를 비교하여 어느 것이 앞에 위치하는지 알 수 없음
		//Members에서 implements compare to 후 정상출력 가능
		
		//역순정렬
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("역순 정렬 결과: " + Arrays.toString(members));
	}
	
	
	private static void basicReverseSort() {
		Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
		
		System.out.println("배열원본: " + Arrays.toString(scores));
		
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순정렬: " + Arrays.toString(scores));
	}
	
	
	private static void basicSort() {
		//기본 타입
		int[] scores = {80, 50, 30, 90, 75, 88, 77};
		
		//배열요소 출력: Arrays.toString()
		System.out.println("배열원본: " + Arrays.toString(scores));
		System.out.println("배열원본: " + scores);
		
		Arrays.sort(scores);   //기본정렬순서: 오름차순
		System.out.println("정렬된 배열: " + Arrays.toString(scores));
	}
}
