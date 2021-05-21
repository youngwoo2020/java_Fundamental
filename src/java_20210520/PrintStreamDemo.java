package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; // destination :file
		PrintStream ps1 = null; // destination :모니터 출력
		ps1 = System.out; // 출력하려면 ps1.print로 하면됨(출력을 자주 하려면 이렇게 사용하는 게 맞음. 평소에는 sop를 사용
		ps1.println("Hello");
		ps1.println("안녕하세여");

		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis); // stream chaining
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy1.zip");
			bos = new BufferedOutputStream(fos); // stream chaining

			// printStream
			// 1. printStream의 메서드는 IOException을 발생시키지 않는다.
			// 2. auto flush 기능을 가지고 있음. => 두번빼 인자에 true

			ps = new PrintStream(bos, true);// stream chaining, auto flush

			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				ps.write(readByte); //write말고 print를 쓸 수 있음. but 그러면 buffered기능이 없기 때문에 1바이트씩 출력(느림)
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { //닫는 순서 중요함. 
				if (fis != null)
					fis.close();
				if (bis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (ps != null)
					ps.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
