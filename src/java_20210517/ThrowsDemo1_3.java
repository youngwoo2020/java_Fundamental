package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo1_3 {

	public static void m() throws FileNotFoundException {
		FileReader fr = new FileReader("");
	}

	public static void m(String path) throws FileNotFoundException {
		FileReader fr = new FileReader(path);
	}

	public static void main(String[] args) {

		String path = args[0];
		try {
			m(path);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("경로와 파일명을 정확히 입력하세요");
		} catch (ArrayIndexOutOfBoundsException E) {
			System.err.println("실행시 파일명을 입력하세요");
			System.err.println("예) Rung Configrations->Arguments->Program Argument");
		}

	}
}
