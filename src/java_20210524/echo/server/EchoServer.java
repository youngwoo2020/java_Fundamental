package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			// 1. ServerSocket 인스턴스를 생성한다. (도표 중1번)
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[서버화면 입니다]");
		// 2. (도표 중 2번 accept) 클라이언트 접속을 기다린다.
		// accept() : 클라이언트 접속을 기다리다가 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket객체를 생성해준다.
		while (true) { // 무한루프
			System.out.println("클라이언트 접속을 대기하고 있습니다");
			try {
				Socket socket = serverSocket.accept();
				// 4. 클라이언트와 통신할 수 있는 socket 객체가 생성되었다.
				// 6-2
				InetAddress i = socket.getInetAddress();

				// 5. socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
				InputStream in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				// 6-3
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				while (true) {
					String readLine = br.readLine();
					System.out.println("클라이언트 메세지: " + readLine);
					bw.write(readLine);
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * EchoServer echoServer = new EchoServer(3000); ehchoServer.run(); =>아래 코드와 같음.
		 * 재사용을 안하기 때문에 변수선언을 안하는 것이 바랍직함.
		 */
		new EchoServer(3000).run();
	}
}
