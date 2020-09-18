package com.javaex.thread;

//방식1. Thread 상속: Thread 클래스를 세부적으로 조정 可

public class DigitThread extends Thread {
	//thread 실행 로직: run()
	//remember: 직접 실행시키면 method! 
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.printf("[%s]:%d%n", getName(), i);
		} 
		//잠시 지연
		try {
			Thread.sleep(400);  //0.4초 지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
