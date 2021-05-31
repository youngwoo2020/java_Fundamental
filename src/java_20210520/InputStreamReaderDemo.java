package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // source가 키보드인 경우.
		byte[] b = new byte[100];

		// read=>consol에서 keyboard에서 엔터를 칠때까지 않읽음. 키보드에 abc친 것이 b(배열)에 저장되어 있음.
		int readByteCount = 0;
		System.out.print("입력하세요");
		while ((readByteCount = in.read(b)) != -1) {
			String message = new String(b, 0, readByteCount); // 배열이기 때문에 0~readByteCount까지 범위를 설정해 줘야 함.
			//trim이 /r/n도 제거를 해줌. message에 /r/n이 포함되어 있기 때문에
			//trim으로 제거함.
			if(message!=null&&message.trim().equals("quit")) break; 
			System.out.print(message);
			System.out.print("입력하세요");
		}
		
		/*InputStream in = System.in; //키보드로 입력받은 것
		InputStreamReader isr = new InputStreamReader(in); //바이트 출력 스트림을 문자 출력 스트림으로 바꿔주는 클래스
		BufferedReader br = new BufferedReader(isr); //한줄단위로 읽고 쓰기 위해
		
		FileWriter fw = new FileWriter("C:\\Users\\user\\message.txt",true); //append기능, 경로 열어보면 consol에 입력한 내용이 파일에 저장됨.
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		System.out.print("입력하세요");
		while((readLine = br.readLine())!=null) {
			if(readLine !=null &&readLine.equals("quit"))break;
			System.out.println(readLine);
			bw.write(readLine); //bufferedWriter는 게행이 안된다. flush도 안된다. 
			bw.newLine();
			System.out.print("입력하세요");
			
		}
		bw.flush();*/
	}
}
