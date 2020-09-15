package com.javaex.oop;

public class MethodEx {
	public static void main(String[] args) {
//		System.out.println("4 + 5 = " + getSum(4, 5));
		System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(getSum(6, 7, 8, 9, 10));
		
		printSum("총계", 1, 2, 3, 4, 5);
	}
	
	public static void printSum(String message, double ...values) {
		//고정인수와 가변인수를 함께 사용 
		//순서 중요: 고정인수 선언 후 가변인수
		System.out.println(message + ":" + getSum(values));
	}
	
	
	public static double getSum(double ... values) {
		//가변인수 -정해지지 않은 갯수의 인수
		//배열로 변환되어 전달 -인수의 길이를 구하고 루프를 돌릴 수 있다. 
		double total = 0;
		
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
		
		return total;
	}
	
	public static double getSum(double num1, double num2) {
		return num1 + num2;
	}
}
