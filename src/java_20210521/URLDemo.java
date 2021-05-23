package java_20210521;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
public static void main(String[] args) throws IOException {
	try {
		//URL url = new URL("https://imgnews.pstatic.net/image/138/2021/05/21/0002103731_001_20210521093904926.jpg?type=w647");
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=018&aid=0004935289");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		System.out.println("protocal :" + protocol);
		System.out.println("host :" +host);
		System.out.println("port :" +port);
		System.out.println("path :" + path);
		System.out.println("query :" + query);
		System.out.println("ref :" + ref);
	
	/*	InputStream in = url.openStream(); //source => img (소스가 꼭 html이 아닐 수 있다 ex. 이미지) 
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\test.jpg");
		while((readByteCount=in.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteCount);
		} 
		
		fos.close();
		*/
		
		InputStream in = url.openStream(); //source => html
		InputStreamReader ist = new InputStreamReader(in, "euc-kr");
		BufferedReader br = new BufferedReader(ist);
		
		String readLine= null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);	
		}
		
		
		
		
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
