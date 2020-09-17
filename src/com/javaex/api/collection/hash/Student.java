package com.javaex.api.collection.hash;

public class Student {
	//field
	private int id; //학번
	private String name; //이름
	
	//생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	//메서드 오버라이드
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
	//동일 학생을 중복하여 추가했던 문제 해결과정
	@Override
	public int hashCode() {
		// 객체를 "식별"하는 "정수값" --학번
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 Student인지 확인부터 하고 값 비교!
		if (obj instanceof Student) {      //맞다면 변환가능
			Student other = (Student)obj;  //다운캐스팅
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}	
}
