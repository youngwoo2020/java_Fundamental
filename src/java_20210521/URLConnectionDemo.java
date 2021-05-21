package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=018&aid=0004935289");
		URLConnection urlcon = url.openConnection();

		String cacheControl = urlcon.getHeaderField("cache-control");
		String contentType = urlcon.getHeaderField("content-type");
		String date = urlcon.getHeaderField("date");

		System.out.println("cache-control :" + cacheControl);
		System.out.println("content-type :" + contentType);
		System.out.println("date :" + date);

		InputStream in = urlcon.getInputStream();// 서버에 있는 자원을 가지고 올 수 있음. (url 클래스랑 메서드가 다름 cf) url=>open~~)

		InputStreamReader ist = new InputStreamReader(in, "euc-kr");
		BufferedReader br = new BufferedReader(ist);

		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}
}
