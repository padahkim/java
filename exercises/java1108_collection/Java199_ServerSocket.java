package selfstudy1108;

import java.io.*;
import java.net.*;

public class Java199_ServerSocket {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket;
		try {//1포트번호를 지정해서 서버생성
			server = new ServerSocket(7777);
			//2클라이언트 요청이 들어올때 까지 대기
			socket = server.accept();
			System.out.println(socket);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}//end main

}//end class
