package com.javaex.api;

public class StringEx {
	public static void main(String[] args) {
//		stringBasic();
//		usefulMethods();
		stringBufferEx();
	}
	
	
	private static void stringBufferEx() {
		//String +, 변환 수행하면 새 String 객체 생성
		//StringBuffer: 버퍼 기반 문자열 생성기
		StringBuffer sb = new StringBuffer("This"); //버퍼 생성, 초기화
		
		//문자열 추가
		sb.append(" is pencil");
		
		//문자열 삽입
		sb.insert(7, " my");
		
		//문자열 치환
		sb.replace(7, 10, " your"); //start-inclusive, end-exclusive
		
		System.out.println(sb);
		
		//메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		
		String result = sb2.toString();
		
		System.out.print(result);
	}
	
	private static void usefulMethods() {
		//중요 메서드 정리
		String str = "Java Programming JavaScript Programming";
				
		//문자열은 char의 연속된 집합
		// =인덱스 접근, 길이 출력 가능
		System.out.println("str length = " + str.length());                     //길이 출력
		System.out.println("가장 마지막 글자: " + str.charAt(str.length() - 1));     //인덱스 접근
		
		//변환 메서드
		System.out.println("모두 대문자로: " + str.toUpperCase());
		System.out.println("모두 소문자로: " + str.toLowerCase());
		
		//문자열은 immutable!!
		System.out.println("원본: " + str);
		
		//중요: indexOf()
		//문자열에서 Java 인덱스하기
		int index = -1;
		
		index = str.indexOf("Java");  // 첫번째 검색
		System.out.println("1번째 검색 위치: " + index); 
		
		index = str.indexOf("Java");  // 두번째 검색
		System.out.println("2번째 검색 위치: " + index);  
		
		index = str.indexOf("Java", 4);  // 세번째 검색 --위치조정
		System.out.println("3번째 검색 위치: " + index);
		
		index = str.indexOf("Java", index + 4);  // 네번째 검색
		System.out.println("4번째 검색 위치: " + index);  // -- -1 출력 (=찾을 수 없음)
		
		//cf. 역방향 검색: lastIndexOf()
		index = str.lastIndexOf("Java");  
		System.out.println("역방향 검색: " + index);
		
		//치환
		str.replace("JavaScript", "Python");
		System.out.println("치환-할당 전: " + str);  //변화 일어나지 않았음 (.replace() 후 새 객체를 생성했기 때문에 새롭게 할당해야 적용됨)
		
		str = str.replace("JavaScript", "Python");
		System.out.println("치환-할당 후: " + str);  //변화 일어남
		 
		//문자열 추출
		index = str.indexOf("Programming"); //Programming의 인덱스 확인
		if (index != -1) {
			System.out.println(str.substring(index, index + 11));
		}
		
		System.out.println(str.substring(16)); // end index생략되면 끝까지 
		
		String s2 = "          Hello, Java        ";
		System.out.println(s2.trim());  //좌우의 whitespace 제거
		
		//문자열 분리: split -구분 기호를 기준으로 분자열 분리 후 배열으로 반환
		String words[] = str.split(" ");
		for (String word: words) {
			System.out.println("단어: " + word);
		}		
	}
	
	private static void stringBasic() {
		//Literal vs new
		String s1 = "Java";    //literal
		String s2 = "Java";    //literal
		
		String s3 = new String("Java");  //새 객체
		String s4 = new String("Java");  //새 객체 
		
		System.out.println("s1 == s2 ? " + (s1 == s2));    // --T
		System.out.println("s3 == s4 ? " + (s3 == s4));    // --F
		System.out.println("s1 == s3 ? " + (s1 == s3));    // --F
		
		//char을 활용한 String 생성
		char[] letters = {'J', 'a', 'v', 'a'};
		String s5 = new String(letters);
		
		System.out.println(s5); 
		
		//다른 기본 타입을 문자로 변환
		String s6 = String.valueOf(Math.PI);
		
		System.out.println(s6);
	}
}
