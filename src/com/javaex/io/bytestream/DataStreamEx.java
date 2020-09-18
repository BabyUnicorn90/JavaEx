package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//기본타입을 저장하고 읽기위한 byte보조스트림
		
		try {
			//주스트림 열기
			OutputStream os = new FileOutputStream(filename);
			//보조스트림 열기
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.5F);
			
			dos.writeUTF("임꺽정");
			dos.writeBoolean(true);
			dos.writeInt(30);
			dos.writeFloat(99.9F);
			
			dos.close();		
			
			//읽어오기
			//주의: 저장된 순서대로 읽어와야 한다. 
			InputStream is = new FileInputStream(filename); //주스트림
			DataInputStream dis = new DataInputStream(is); //보조스트림
			
			for (int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s - %b:%d:%f%n", s, b, val, f);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
