package com.javaex.api.objectclass.v4;

//깊은 복제
public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1 = " + s1);
		
		//복제 시도
		Scoreboard s2 = s1.getClone();
		System.out.println("s2 =  " + s2);
		
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); //값 비교 확인 
		
		//
		s2.getScores()[1] = 100;
		System.out.println("s1 = " + s1);
		System.out.println("s2 =  " + s2);  //s2 값을 바꿨는데 s1도 같이 바뀜 
		
		System.out.println("s1.scores == s2.scores ? " + (s1.getScores() == s2.getScores())); //내부 참조 필드 비교 확인  --T (: 얕은복사)
		
	}

}
