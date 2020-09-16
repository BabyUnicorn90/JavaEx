package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	//field
	private int[] scores; // 참조 타입 필드
	
	//생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	//복제
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제 실패");
		}
		
		return clone;
	}

	//Getter
	public int[] getScores() {
		return scores;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//깊은 복제를 위해 clone 메서드 오버라이드
		
		//먼저 얕은복제 시도:
		Scoreboard clone = (Scoreboard)super.clone();   //1.super을 이용해 clone을 만들고  2. (Scoreboard)
		
		//내부의 참조 객체의 복제 시도:  (:깊은 복제)
		clone.scores = Arrays.copyOf(scores, scores.length);  //내가 가지고 있는 배열을 새로운 객체로 만들고 연결시켜줌
		
		return clone;
	}
	
	
}
