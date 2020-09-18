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
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		//서버 소켓 생성하기
		ServerSocket serverSocket = null;
		
		//내 아이피주소랑 연결하기
		try {
			//주소, 포트 바인드
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			System.out.println("<서버 시작>");
			System.out.println("[서버: 연결을 기다립니다.]");
			
			while(true) {
				//서버소켓은 대기하게 만들고, 통신소켓 연결하기
				Socket socket = serverSocket.accept();    //대기상태
				
				//server thread 생성하기
				Thread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
			}
		}
	}
}
