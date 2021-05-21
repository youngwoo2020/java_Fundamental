package java_20210521;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) {
		InetAddress i;
		try {
			i = InetAddress.getLocalHost();
			// 일반클래스지만 디폴트 생성자이기 때문에 객체생성을 바로 할 수 없음.
			System.out.printf("호스트 이름 : %s%n", i.getHostName());
			System.out.printf("IP : %s%n", i.getHostAddress());
			
			InetAddress i2 = InetAddress.getByName("naver.com");
					// 일반클래스지만 디폴트 생성자이기 때문에 객체생성을 바로 할 수 없음.
					System.out.printf("호스트 이름 : %s%n", i2.getHostName());
					System.out.printf("IP : %s%n", i2.getHostAddress()); //도메인을 치면 아이피를 알 수 있다. 

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //www.daprs.com
}