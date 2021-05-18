package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
			// 파일아웃풋스트림->파일이 없다고 에러가 나는 것이 아니라 경로가 잘못되면 에러남
			// 매개변수 path의 디렉토리가 존재하지 않으면 예외 발생
			// 예외가 발생하지 않고 객체가 생성되면 파일을 만든다.
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-copy.zip");

			/*
			 * int readByte = 0; long start = System.currentTimeMillis();
			 * 
			 * //read()는 1바이트 읽어서 읽은 바이트를 반환한다. while((readByte = fis.read())!=-1) {
			 * //write()는 1바이트 쓰기를 한다. fos.write(readByte); }
			 * 
			 * long end = System.currentTimeMillis(); System.out.printf("경과시간 : %d %n",
			 * (end-start));
			 */

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 400]; // 어느 바이트를 돌렸을 때 가장 빠른지 최적의 바이트를 찾아내야 함
			long start = System.currentTimeMillis();
			// 무조건 외우기
			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount); // 배열의 마지막(1000단위가 아닌)때문에!
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end - start));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
