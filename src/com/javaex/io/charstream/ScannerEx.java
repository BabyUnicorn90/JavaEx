package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Scanner은 다영한 입력 소스로부터 데이터를 같은 방식으로 읽을 수 있다. --vs.StringBufferEx
public class ScannerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {
				name = scanner.next();   //분절된 문자열
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s - %.2f, %f%n", name, height, weight);
				scanner.nextLine(); //남아있는 데이터 찾기
			}			
			scanner.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
