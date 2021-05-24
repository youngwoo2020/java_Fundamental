package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerScoketScan {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for (int port = 0; port < 65536; port++) {
			try {
				serverSocket = new ServerSocket(port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(port+"해당 포트를 사용중입니다.");
			}
		}
	}
}
