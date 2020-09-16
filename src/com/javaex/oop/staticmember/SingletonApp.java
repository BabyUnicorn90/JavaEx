package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();  //생성자가 private이므로 접근 불가 
		Singleton s1 = Singleton.getInstance();
		s1.getScores()[5] = 80;
		
		Singleton s2 = Singleton.getInstance();

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s1);
		
		System.out.println("s1 == s2 ? " + (s1 == s2));  //참조의 ==는 주소비교!   --T (=두 객체는 동일객체) 
		
		System.out.println("s2[5] == " + s2.getScores()[5]);
	}

}
