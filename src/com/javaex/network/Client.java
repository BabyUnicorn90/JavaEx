package com.javaex.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			
			System.out.println("<클라이언트 시작");
			System.out.println("[클라이언트: 접속요청]");
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);  //서버주소
			socket.connect(remote);
			
			System.out.println("[클라이언트: 서버에 연결되었습니다.]");
			
			//스트림 이용 서버로 메시지 전송
			//통신제어
			OutputStream os = socket.getOutputStream(); //주 스트림
			Writer osw = new OutputStreamWriter(os, "UTF-8");  //인코딩
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//키보드입력제어
			Scanner scanner = new Scanner(System.in);
			
			while (true) {  //-----------------------------------무한루프
				String msg = scanner.nextLine(); //한 줄 읽기
				
				if (msg.equals("/q")) {
					break;  //-----------------------------------무한루프 탈출방법
				}
				
				bw.write(msg);
				bw.newLine(); //개행
				bw.flush();
				
				System.out.println("[클라이언트: 메시지전송]" + msg);
				
				//서버 응답받기
				String rcvMsg = br.readLine();
				System.out.println("[클라이언트: 메시지수신]" + rcvMsg);
			}
			
			
			
			scanner.close();
			br.close();
			bw.close();
			System.out.println("<클라이언트 종료>");
			
		} catch (ConnectException e) {
			System.err.println("접속이 거부되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//소켓 닫기
			try {
				socket.close();
			} catch (IOException e) {
				
			}
		}

	}

}
