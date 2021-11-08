package selfstudy1108;

import java.io.*;
import java.net.*;

public class Java199_ClientrSocket {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//서버연결요청(서버주소,포트)
			socket = new Socket("127.0.0.1", 7777);
			System.out.println("client:" + socket);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
