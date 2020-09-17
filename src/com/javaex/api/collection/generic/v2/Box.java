package com.javaex.api.collection.generic.v2;

//Generic 이용
//설계시: Type 지정 X
//실제 객체화 될 때 외부에서 내부 데이터 타입을 결정해주는 방법

//타입 파라미터
//T: Type, K: Key, R: RetrunType, V: Value
public class Box<T> {
	T content;  //int를 담을 수 있는 박스!

	//Getter/Setter
	public T getContent() {
		return content;
	}

	public void setContent (T content) {
		this.content = content;
	}
}
