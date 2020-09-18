package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "char.txt";
	
	public static void main(String[] args) {
		try {
			Writer fwriter = new FileWriter(filename);
			
			//텍스트 저장하기
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2020. 09.\r\n");
			
			fwriter.close();
			
			Reader freader = new FileReader(filename);
			//텍스트 읽어와서 출력하기
			int data = 0;
			while((data = freader.read()) != -1) {
				System.out.print((char)data);   //System.out.print(data); 에서 수정 --다운캐스팅하기
			}
			System.out.println(); 
			
			freader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
