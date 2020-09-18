package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory ();
		
		//첫번째 thread
		User user1 = new User("홍길동", memory, 100);
		User user2 = new User("임꺽정", memory, 50);

		user1.start();
		user2.start();
	}

}
