package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // 클래스변수 - 공용영역
	public static String classVar; //클래스변수
	public String instanceVar; //인스턴스변수
	
	//static member는 instance영역에 접근할 수 없고, 
	//instance영역에서는 static member에 접근할 수 있다. 
	//static member은 초기화하지 않아도(instance화 하지 않아도) 실행 가능(접근 가능)
	
	//static 영역은 클래스가 로드될 때 초기화
	static {
		//static 영역 초기화
		classVar = "Static member";
		refCount = 0;
		System.out.println("Static 초기화");
		
		//static영역에서 instance 접근
//		System.out.println(instanceVar);   --에러. 접근 불가
		//즉, static영역에서는 static member만 활용 가능하다. 
	}
	
	//생성자
	public StaticEx() {
		//instance 영역에서 static 영역으로는 접근 가능
		refCount ++;
		System.out.println("참조개수: " + refCount);
		System.out.println("인스턴스 생성");
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		//객체 해제시 자원정리 용도
		refCount --;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
