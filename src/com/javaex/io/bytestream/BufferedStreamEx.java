package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//보조스트림
public class BufferedStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String src = rootPath + "img.jpg";
	private static String tgt = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//보조스트림은 주스트림에 부가적인 기능을 추가하기 위한 클래스
			//IO작업 수행은 주스트림이 행함.
			
			//주스트림 열기
			is = new FileInputStream(src);
			os = new FileOutputStream(tgt);
			
			//보조스트림 열기
			//보조스트림: 주스트림으로부터 스트림생성
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			//byte데이터여야 한다!
			byte[] data = new byte[10240];
			int size = 0; //전송 바이트 수
			
			while((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + "바이트 전송");
			}
			
			bos.flush();
					
			System.out.println("파일을 복사했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();  
				//보조스트림을 닫으면 연결된 주스르팀도 닫힌다. 
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
