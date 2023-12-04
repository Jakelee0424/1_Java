package edu.kh.network.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServer {

	// Server : 서비스를 제공하는 프로그램 or 컴퓨터
	// Client : 서버에 서비스를 요청하여 사용하는 프로그램 or 컴퓨터
	
	// TCP Socket 프로그래밍
	
	// TCP : 데이터 전달의 신뢰성을 최대한 보장하기 위한 방식(연결 지향형 통신)
	//		 순차적으로 데이터 전달하고 확인 및 오류 시 재전송

	// Socket : 프로세스의 통신에 사용되는 양쪽 끝단
	// 			서버와 클라이언트가 통신을 하기 위한 매개체
	
	// ServerSocket : 서버용 소켓
	// - port와 연결되어 외부 요청을 기다리는 역할
	// -> 클라이언트에게 요청이 올 경우 이를 수락 
	// -> 클라이언트가 사용할 수 있는 소켓을 생성
	// 서버소켓과 클라이언트 소켓이 연결되어 데이터 통신이 가능해짐
	
	public void serverStart() {
		// 루프백 IP사용 127.0.0.1
		
//		1) 서버의 포트번호 정함
		
		int port = 8500; // 포트 번호는 0 ~ 65535, 1023까지는 ㄴㄴ
		
		// 사용할 변수 미리 선언
		ServerSocket serverSocket = null; // serversocket 저장 변수
		Socket clientSocket = null; // clientsocket 저장 변수
		
		InputStream is = null; // client 서버 입력용 변수
		BufferedReader br = null; // 성능향상을 위한 보조스트림(입력)
		
		OutputStream os = null; // 서버에서 client로 출력하는 변수
		PrintWriter pw = null; // 성능향상을 위한 보조스트림(출력)		
		
		try {
			
//			2) 서버용 소켓 객체 생성
			
			serverSocket = new ServerSocket(port); // 소켓과 포트 결합
					
//			3) 클라이언트 쪽에서 접속 요청이 오길 기다림
			
			System.out.println("[Server]");
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
//			4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성

			clientSocket = serverSocket.accept(); // 요청을 수락하면 자동으로 소켓 객체가 얻어와짐
			String clientIP = clientSocket.getInetAddress().getHostAddress(); // 접속한 클라이언트의 IP를 얻어와 출력
			System.out.println(clientIP + "가 연결을 요청함...");
						
//			5) 연결된 클라이언트와 입출력 스트림 생성
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
//			6) 보조 스트림을 통해 성능 개선
			
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
//			7) 스트림을 통해 읽고 쓰기

//			7-1) 서버 -> 클라이언트에게 출력
			
			Date now = new Date(); // 생성된 시간을 기록하고 있는 시간 관련 객체
			// 날짜 출력 형식 변경 필요
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(now); // now에 저장된 시간 포맷을 변경

			pw.println(time + "[서버 접속 성공]");
			pw.flush(); // 스트림에 있는 내용을 모두 밀어냄
			
//			7-2) 클라이언트 -> 서버에 입력(메세지 전송 받기)
			
			String message = br.readLine(); // 클라이언트 메세지 한 줄 읽어옴
			System.out.println(clientIP + "가 보낸 메세지 : " + message);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
//			8) 통신 종료
			// 사용한 스트림, 소켓 자원 모두 반환
			
			try {
				
				if(pw != null) pw.close();
				if(br != null) br.close();
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				// 보조스트림 close시 연결된 기반스트림 모두 close됨
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}


		
		
	}
}
