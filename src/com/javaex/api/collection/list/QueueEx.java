package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//Queue는 인터페이스
		//실체 클래스는 List구현체 사용.
		//FIFO 자료형
		Queue<Integer> queue = new LinkedList<>();
		
		//여러개의 데이터 제공
		for (int i = 1; i <= 10; i++) {
			queue.offer(i); //데이터입력
		}
		
		System.out.println("QUEUE: " + queue);
		
		//입력방향과 인출방향이 정반대
		int item = queue.peek();  //가장 먼저 입력된 값을 확인해준다. 
		System.out.println("peek: " + item);
		System.out.println("QUEUE: " + queue);  
		
		//인출하기: poll  --empty()인지 반드시 확인할 것!
		while(!queue.isEmpty()) {
			System.out.println("인출: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
	}
}
