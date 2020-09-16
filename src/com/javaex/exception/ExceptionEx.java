package com.javaex.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		nullPointerExceptionEx();
//		arrayExceptionEx();
//		arithExceptionEx();
		throwEx();
	}

	private static void throwEx() {
		ThrowsExcept except = new ThrowsExcept();
		try {
			System.out.println("100/0 = " + except.divide(100, 0));
			except.executeRuntimeException();  //unchecked exception
			except.executeException(); //checked exception  --반드시 예외처리
		} catch (CustomArithmeticException e) {
			System.err.println("메시지:" + e.getMessage());
			System.err.println("num1 = " + e.getNum1());
			System.err.println("num2 = " + e.getNum2());
		} catch(ArithmeticException e) {
			System.err.println("산출오류:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("메시지: " + e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of Code");
	}
	
	
	private static void arithExceptionEx() {
		//스캐너로부터 정수를 입력받고 100을 정수로 나눈다. --특정상황(0 입력)에서만 에러발생
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력:");
		
		//예외발생가능 영역 --try catch로묶어주기
		try {
			num = scanner.nextInt();
			result = 100/num;
		} catch (ArithmeticException e) {
			System.err.println("예외메시지:" + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("예외메시지:" + e.getMessage());
		} catch (Exception e) {    // 가장 마지막 catch 블록에서 처리
			e.printStackTrace();   //남아있을 수 있는 예외처리
		} finally {
			System.out.println("예외 처리 완료!"); //예외 유무 상관없이 항상 마지막에
			//주로 사용한 자원 정리에 사용 
		}
		
		scanner.close();
		System.out.println("결과:" + result);
		System.out.println("End of Code");
		
	}
	
	
	
	private static void arrayExceptionEx() {
		//배열의 인덱스 범위를 벗어날 때 발생.
		int [] arr = {1, 3, 5};
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("예외메시지:" + e.getMessage());
		}
		System.out.println();
		System.out.println("End of Code");
	}
	
	
	private static void nullPointerExceptionEx() {
		//가장 흔하고 가장 위험한 예외
		//할당되지 않은 객체를 참조할 때 발생. 
		
		String str = new String("hello world");
		str = null;
		try {
			str = str.toUpperCase(); //대문자로 변환 --현재 str이 null이므로 접근 불가능 --예외발생가능성 --try catch로 묶어주기 
			System.out.println(str);	
		}catch (NullPointerException e) {
			e.printStackTrace();    //모든 예외 정보 출력
		}
		
		System.out.println("End of Code"); //예외 처리를 하지 않으면 실행되지 않음.
	}
}
