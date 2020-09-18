package com.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	//1. 파일경로 따오기
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	//2. 파일객체 만들기
	//파일 객체는 인풋, 아웃풋 작업을 수행하지 않음 --stream이 처리함
	public static void main(String[] args) {
		//파일객체
		File root = new File(rootPath); //파일정보클래스 --정말 이 파일이 존재하는지 확인 必
		//파일존재여부 확인
		System.out.println(rootPath + ":" + root.exists());
		
		printInfo(root);
		
		//디렉토리 생성하기
		if (!root.exists()) {  //체크 잘하기!
			root.mkdirs();
		}
		
		//디렉토리 내 파일 생성하기
		File myFile = new File(rootPath + "myFile.txt");     //파일 생성되지는 않음
		if (!myFile.exists()) {
			try {
				myFile.createNewFile();
			} catch(IOException e) {
				System.err.println("파일 생성 실패");
			}
		}
		
		printInfo(root);
		
		//파일 지우기
		myFile.delete();
		
		printInfo(root);
		
	}
	
	private static void printInfo(File f) {
		System.out.println("============");
		
		if (f.isDirectory()) {  //File이라고 받은 것이 디렉토리라면
			System.out.println("Directory: " + f.getName());
			//목록출력
			File[] files = f.listFiles();
			
			for (File file:files) {
				System.out.println(file.isDirectory() ? "d": "f");
				System.out.println(file.getName());
			}
		} else {
			System.out.println("File: " + f.getName());
		}
		
		System.out.println("============");
	}
}
