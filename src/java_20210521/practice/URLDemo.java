package java_20210521.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
public static void main(String[] args) {
	try {
		URL url = new URL("https://imgnews.pstatic.net/image/629/2021/05/23/20211891621755899_20210523165209864.jpg?type=w647");
		String protocoal = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println(protocoal);
		System.out.println(host);
		System.out.println(port);
		System.out.println(query);
		System.out.println(ref);
	
		InputStream in = url.openStream();
		int readByteCount = 0;
		byte[] readBytes = new byte[1024];
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\test.jpg");
		while((readByteCount=in.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteCount);
		}
	
		/*
		InputStream in = url.openStream();
		InputStreamReader ist = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ist);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
		}
	*/
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
