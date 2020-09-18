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
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket = null;
	
	//생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
			try {
			// ---서버thread 담당 코드 시작 (접속 ~ 끝)
			//클라이언트 접속시 처리
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[서버: 클라이언트가 연결되었습니다.");
			System.out.println("접속 클라이언트 정보: " + socketAddress.getAddress()
														+ ":" + socketAddress.getPort());
						
			//메시지 수신
			//입력 파이프라인
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");  //UTF-8로 인코딩
			BufferedReader br = new BufferedReader(isr);
			
			//출력 파이프라인
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//메시지 읽고 Echo Back
			while(true) {
				String msg = br.readLine();
				
				if (msg == null) {
					//접속종료
					System.out.println("[서버: 클라이언트 접속이 종료되었습니다.]");
					break;
				}
				
				System.out.println("[서버: 전송된 메시지]" + msg);
				
				//EchoBack
				System.out.println("[서버: EchoBack]");
				bw.write("[Echo Message]" + msg);
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			br.close();
			
			System.out.println("<서버 종료>");
			// ---서버thread 담당 코드 끝
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}