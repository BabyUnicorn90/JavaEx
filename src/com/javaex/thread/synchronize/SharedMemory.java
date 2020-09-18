package com.javaex.thread.synchronize;

//여러 thread가 공용으로 사용할 객체
public class SharedMemory {
	//field
	private int memory;

	
	//getter/setter
	public int getMemory() {
		return memory;
	}

	
	//공유영역 보호: synchronized --객체 lock 시키기
	//임계영역: 멀티thread 프로그램에서 단 하나의 thread만 실행시킬 수 있는 코드 영역
	public synchronized void setMemory(int memory) {      //synchronized 안하고 main thread 실행시키면 홍길동, 임꺽정 다 50
		this.memory = memory;
		try {
			Thread.sleep(1000); //1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
