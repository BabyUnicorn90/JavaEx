package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//ByteArrayStream: 배열 데이터를 입출력하는 바이트스트림
public class ByteArrayStremEx {
	//Stream: 프로그램, 입력소스, 출력타겟을 연결하는 클래스
	//기본적으로 일방향

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력소스 
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outTarget = null;
		
		//인풋소스 확인
		System.out.println("입력소스: " + Arrays.toString(inSrc));
		
		try {
		//입력 스트림
		InputStream bis = new ByteArrayInputStream(inSrc);
		
		//출력 스트림
		OutputStream bos = new ByteArrayOutputStream();
		
		//인풋 스트림의 데이터 저장
		int data = 0;  
		
		while((data = bis.read()) != -1) {
			System.out.println("Read Data: " + data);
			bos.write(data);
		}
		
		//아웃풋 타겟에 연결
		outTarget = ((ByteArrayOutputStream)bos).toByteArray();  //다운캐스팅 후 배열로 반환
		System.out.println("타겟 배열: " + Arrays.toString(outTarget));
		
		//시스템 자원 반환
		bos.close();
		bis.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
