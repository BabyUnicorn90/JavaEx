package com.javaex.thread.synchronize;

//thread 공유
public class User extends Thread {
	//field
	private SharedMemory memory;
	private int data;
	
	//생성자
	public User(String name, SharedMemory memory, int data) {
		//thread의 이름
		this.setName(name);
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if (memory != null) {
			memory.setMemory(data);
		}
	}
}
