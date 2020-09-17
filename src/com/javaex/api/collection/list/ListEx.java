package com.javaex.api.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		//List --인터페이스
		//LinkedList --실체 클래스
		List<String> lst = new LinkedList<>();
//		List<String> lst = new ArrayList<>(); //다른클래스이긴 하지만 같은 규약을 가진 클래스 --언제든지 교체 가능
		listTest(lst);

	}

	private static void listTest(List<String> lst) {
		//객체 추가: add
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst:" + lst);
		
		//삽입하기
		lst.add(2, "C#");
		
		//값 중복 허용
		lst.add("Java");
		System.out.print("lst:" + lst);
		
		//삭제하기
		lst.remove(2);       //인덱스로 삭제하기
		lst.remove("Java");  //객체이름으로 삭제하기
		
		System.out.println("lst:" + lst);
		
		//List, Set에서는 Iterator을 사용
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext()) {
			//뒤에 더 있으면: 
			String item = it.next();
			System.out.println("item: " + item);
		}
  
        //리스트 비우기
        lst.clear();
        System.out.println("lst:" + lst);
	}
}
