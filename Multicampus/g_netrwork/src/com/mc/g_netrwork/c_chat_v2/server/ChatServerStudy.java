package com.mc.g_netrwork.c_chat_v2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ChatServerStudy {

	private ServerSocket serverSocket; // 서버 개발할때 사용하는 클래스
	private Map<String, Socket> socketMap; // 

	public ChatServerStudy() {

		try {
			this.serverSocket = new ServerSocket(80);
			socketMap = Collections.synchronizedMap(new HashMap<>());
		} catch (Exception e) {
			e.printStackTrace(); // 단계별 예외처리
		}

	}

	public void startServer() {

		System.out.println("서버를 시작합니다...");

		while (true) {
			try {
				Socket socket = serverSocket.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void read(Socket socket) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				String userId = "anonymous";

				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

					while (true) {
						String message = br.readLine();

						// socket연결이 끊기면, 더이상 스트림에서 읽어올 데이터가 없기 때문에, readLine이 null을 반환
						if (message == null)
							break;

						String header = message.substring(0, message.indexOf("&") + 1);
						String body = message.replace(header, "");

						if (header.startsWith("type=regist")) {

							// 클라이언트가 보낸 userId값을 전체 메시지에서 추출
							String tmp = message.substring(message.indexOf("&") + 1);
							if (registUser(tmp, socket)) userId = tmp;
						}else if(header.startsWith("type=dm")) {
							
							// 보낼 사용자 아이디를 추출
							// dm <to> / message
							String to = body.substring(body.indexOf(" "), body.indexOf("/")).trim(); // trim : 문자열 앞뒤 공백 제거
							String chat = body.substring(body.indexOf("/")+1).trim();
							sendDM(to, userId, chat);
							
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		
		thread.start();
	}
	
	protected void sendDM(String to, String userId, String message) throws IOException {
		
		if(!socketMap.containsKey(to)) {
			write(socketMap.get(userId), "존재하지 않는 사용자 입니다.");
			return;
		}
		write(socketMap.get(to), "from" + userId + " : " + message);
	}
	
	protected boolean registUser(String userId, Socket socket) {
		try {
			
			if(socketMap.containsKey(userId)) {
				String message = "auth=false";
				write(socket, message);
				// socketMap에 추가되는 순간부터, socket은 broadcast의 대상이 됨
				// broadcast란 1:N 통신, 데이터를 여러 방향으로 동시에 전송하여 동일 IP그룹에 있는 컴퓨터라면 데이터를 수신할 수 있는 방식이다.
				socketMap.put(userId, socket);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	private void write(Socket socket, String message) throws IOException {
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		writer.println(message);
		writer.flush();
	}

}
