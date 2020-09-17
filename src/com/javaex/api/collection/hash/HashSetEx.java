package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	
	//HASH SET: 집합응ㄹ 나타내는 자료형
	//순서 중요하지 않고, 중복 X
	public static void main(String[] args) {
		//기본자료형 HashSet에 활용
//		primTypeSet();
		customTypeSet();
	}

	private static void customTypeSet() {
		HashSet<Student> cls = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("임꺽정", 20);
		Student s3 = new Student("임꺽정", 20);  //s2와 동일한 내용
		
		cls.add(s1);
		cls.add(s2);
		cls.add(s3);
		
		System.out.println("클래스: " + cls);  //s2와 s3가 동일한 학생이지만 다른 학생으로 인식하는 문제 발생
		
		//문제확인 --두 객체가 동등한지 확인하는 방법:
		//1. hashCode() 값 비교
		//2. equals() 결과 확인
		System.out.println("s2와 s3의 hashcode가 같은가? " + (s2.hashCode() == s3.hashCode()));              // --F
		System.out.println("s2와 s3의 값이 같은가? " + s2.equals(s3));                                        // --F
		 
		//학생 임꺽정이 포함되어있는가?
		System.out.println("학생 임꺽정이 포함되어있는가? " + cls.contains(s2));   // --T
		
		//문제해결 --Students.java에서
		//1. hashCode 생성
		//2. equals() 값이 같도록
	}
	
	
	private static void primTypeSet() {
		//선언
		HashSet<String> hs = new HashSet<>();
		
		hs.add("홍길동");
		hs.add("임꺽정");
		hs.add("장길산");
		hs.add("전우치");
		hs.add("임꺽정"); //중복 X
		
		System.out.println("Set: " + hs);
		
		//지정 객체를 포함하는지 여부 확인하기
		System.out.println("임꺽정이 포함되어있는가? " + hs.contains("임꺽정"));    // --T
		
		//객체 삭제: remove
		hs.remove("임꺽정");
		System.out.println("임꺽정이 포함되어있는가? " + hs.contains("임꺽정"));   // --F
		
		hs.remove("임꺽정");  //지워진 객체를 다시 지우면 아무 일도 일어나지 않는다. 
		System.out.println("Set: " + hs);
	}
}
