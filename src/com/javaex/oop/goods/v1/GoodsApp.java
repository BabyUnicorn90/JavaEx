package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		//사용(참조)
		Goods notebook = new Goods();
		//필드에 접근
		notebook.name = "LG Gram";
		notebook.price = 150000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		System.out.printf("%s, %d%n",
				notebook.name, notebook.price);
		System.out.printf("%s, %d%n",
				smartphone.name, smartphone.price);
		

	}

}
