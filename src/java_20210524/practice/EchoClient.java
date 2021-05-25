package java_20210524.practice;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	public void run() {
		Socket socket = null;
		
		try {
			socket = new Socket(ip, port);
			System.out.println("서버와의 접속이 성공했습니다.");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new EchoClient("92.168.0.28",3000).run();
	}
}
