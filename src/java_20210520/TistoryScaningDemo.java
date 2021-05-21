package java_20210520;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TistoryScaningDemo {
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		URL url = new URL("https://jamesdreaming.tistory.com/99");
		InputStream in = url.openStream(); // url을 가져오는 것 openStream() 리턴값이 InputStream
		// 키보드 => system.in
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);

		FileWriter fw = new FileWriter("C:\\Users\\user\\tistory.html");
		BufferedWriter bw = new BufferedWriter(fw);

		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
	}
}
