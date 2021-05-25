package java_20210524.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private int port;
	
	public EchoServer(int port) {
		this.port=port;
	}
	
	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter ost = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[서버화면]");
		
		while(true) {
			System.out.println("클라이언트 접속을 기다리고 있습니다.");

			try {
				Socket socket = serverSocket.accept();
				
				
			InputStream in = socket.getInputStream();	
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new EchoServer(3000).run();
	}
	
	
}
