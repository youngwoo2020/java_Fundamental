package java_20210524.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 {
	private String ip;
	private int port;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public String consol(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine(); // 메세지>hello
	}

	public void run() {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			// 3. (도표3번)ip와 port로 서버에 접속을 시도한다.
			socket = new Socket(ip, port);
			System.err.println("서버와의 접속이 성공했습니다.");
			// 6. socket을 이용해서 서버와 통신할 수 있는 입출력 스트림 생성
			// 6-1
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);

			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);

			while (true) {
				String message = consol("메세지>");
				bw.write(message);
				bw.newLine();
				bw.flush();
				// 6-5

				String readLine = br.readLine();
				System.out.println("서버로부터 받은 메세지: " + readLine);
			}
		} catch (IOException e) {
			System.out.println("서버와의 접속이 실패했습니다.");
		}
	}

	public static void main(String[] args) {
		// cmd => ipconfig =>ip주소
		new EchoClient2("192.168.0.28", 3000).run();
	}
}
