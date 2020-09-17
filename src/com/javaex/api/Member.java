package com.javaex.api;

//사용자정의 객체의 같음, 대소관계를 비교하려면 Comparable 인터페이스 구현!
public class Member implements Comparable {
	//field
	private String name;
	
	//생성자
	public Member(String name) {
		this.name = name;
	}

	//toString
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	//인터페이스 메서드 구현
	@Override
	public int compareTo(Object o) {
		//return type(여기서는 int)이 같다면 0, 작다면 -1, 크다면 1
		//넘겨받은 object가 비교가능한지 확인
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
}
