package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		//DigitThread 작업 후_thread 불러와 실행시키기
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		
		thread.start(); //start메서드 내부에서 run메서드 호출	
		
//		//메인thread 만들기
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println("[MainThread]:" + ch);
//			
//		//잠시 대기
//			try {
//			Thread.sleep(300); //0.3초 지연
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}  //AlphabetThread 후 주석처리
		
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.start();
		
		//Sub thread의 제어를 위해서 sub thread흐름을 main thread에 연결!
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Maninthread 종료");
	}
}
