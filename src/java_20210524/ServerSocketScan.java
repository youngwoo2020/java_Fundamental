package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for (int port = 1; port < 65536; port++) {
			try {
				// serverScoket 클래스는 해당 서버의 port번호를 사용할 수 있으면
				// serverScoket 인스턴스를 생성할 수 있고,
				// 그렇지 않으면 예외를 발생한다. 즉, 예외가 발생했다는 것은 해당 port를 사용하고 있다는 것을 의미
				serverSocket = new ServerSocket(port);

			} catch (IOException e) {
				System.err.println(port + "해당 포트를 사용중입니다.");
			}
		}
	}
}
