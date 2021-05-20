package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo_3 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo-copy1.java");
			bw = new BufferedWriter(fw);
			String readLine = null; // 한줄을 읽음
			while ((readLine = br.readLine()) != null) { // readLine은 -1값이 아니라 null, 게행을 포함하지 않는다.
				bw.write(readLine);
				bw.newLine(); // 게행을 해줘야 함.
				System.out.println(readLine); //게행을 해야하기 때문에 ln을 붙여야 함. 
			}
			bw.flush(); // 오토플러쉬가 없음.

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
				if (fw != null)
					fw.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
