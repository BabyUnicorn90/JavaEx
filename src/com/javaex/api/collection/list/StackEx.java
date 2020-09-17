package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//stack 선언
		//stack: LIFO자료형, 입출력방향 동일
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Stack: " + stack);
		
		//가장 마지막 값 확인하기: peek
		System.out.println("peek: " + stack.peek());  //추출되지는 않음
		System.out.println("Stack: " + stack);
		
		//인출하기: pop
		int item = stack.pop();
		System.out.println("인출된 값: " + item);
		System.out.println("Stack: " + stack);
		
		System.out.println(stack.pop());
		System.out.println("Stack: " + stack);
		
		for (int i = 0; i < 10; i++) {
			stack.push(1);
		}
		
		System.out.println("Stack: " + stack);
		
		//주의: stack이 비어있을 때 pop을 하면 예외처리
		while(!stack.empty()) {    
			System.out.println("pop: " + stack.pop());
		}
	}
}
