package com.javaex.oop.summary;

public class SummaryApp {
	
	private static Kungfu dojang[]; //인터페이스 Kungfu의 배열
	
	public static void main(String[] args) {
		Human h1 = new Human("홍길동");
		Human h2 = new TheOne("네오");   //부모 타입으로 자식을 참조
		Panda p1 = new Panda("핑");
		Panda p2 = new KungfuPanda("포");

		//쿵푸를 시켜봅시다.
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
	
		//모든 객체가 하늘을 나로도록
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		//뭉푸 도장에 등록하기
		dojang = new Kungfu[] {
//				h1,
				(Kungfu)h2,
//				p1,
				(Kungfu)p2
		};
		
		for (Kungfu actor: dojang) {
			actor.kungfu();
		}
	}
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
		}else {
			System.out.println(actor.name + ": 날 수 없어요");
		}
	}
	private static void fight(Animal actor) {
		//actor 객체가 쿵푸를 할 수 있는가? ---instanceof 활용
		if (actor instanceof Kungfu) {
			//다운캐스팅 후 쿵푸
			((Kungfu)actor).kungfu();
		}else {
			System.out.println(actor.name + ": 쿵푸 못해요");
		}
	
	}

}
