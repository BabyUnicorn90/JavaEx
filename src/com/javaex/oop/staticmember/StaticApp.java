package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//static영역은 인스턴스화 하지 않아도 접근 가능
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		s1 = null; //참조 해제
		System.out.println("s1 참조해제");
		System.out.println("참조카운트" + StaticEx.refCount);
		
		//garbage collector 강제수행     --가급적 사용하지 않도록. 
		System.gc();
		try {
			Thread.sleep(3000); //3초 대기
			System.out.println("참조카운트" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}
