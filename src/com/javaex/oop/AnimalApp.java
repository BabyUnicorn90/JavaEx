package com.javaex.oop;
 
public class AnimalApp {

	public static void main(String[] args) {
		//[1]
		Dog d1 = new Dog("도기");
		//참조 타입의 설계도에 있는 내용만 사용가능
		d1.eat();
		d1.walk();
		d1.bark();
	
		
		//[2]
		//d2의 업캐스팅: 
		Animal d2 = new Dog("아지");  //부모클래스로 자식인스턴스를 참조할 수 있다.
		d2.eat();
		d2.walk();
//		d2.bark();   //d2는 Animal에 만들어진 인스턴스이므로 자식클래스에 있는 메서드인 bark는 사용불가.
		
		//d2의 다운캐스팅: 부모클래스로 참조되는 객체를 원래대로(자식클래스로) 돌리는 것.
		((Dog)d2).bark();   //d2가 다운캐스팅 되었으므로 자식클래스에 있는 메서드 사용 가능.
		
		
		//[3]
		Animal pet = new Dog("바둑이");
		pet.eat();
		pet.walk();
		
		pet = new Cat("야옹이");
		pet.eat();
		pet.walk();
		
//		((Dog)pet).bark();  //컴파일로는 에러가 나지 않지만 코드실행시 에러 
		
		//그러므로 내가 다운캐스팅하고자 하는 인스턴스가 어떤 자식클래스에 속한 것인지 확인 필요! 
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
