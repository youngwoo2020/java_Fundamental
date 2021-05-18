package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo1 {
public static String format(File f) {
	long lastModified = f.lastModified();
	Calendar cal = Calendar.getInstance();
	cal.setTimeInMillis(lastModified);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
	String format = sdf.format(cal.getTime());
	return format;
}

public static void main(String[] args) {
	File f = new File("C:\\dev\\test\\2021\\05\\19");
	if(f.mkdirs()) {
		System.out.println("디렉토리를 생성했습니다.");
	}else {
		System.out.println("이미 디렉토리가 존재합니다");
	}
	File f1 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
	long len = f1.length();
	System.out.printf("%,dKB%n",len/1024);
	
	boolean isFile = f1.isFile();
	if(isFile) {
		String path = f1.getPath();
		if(path.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		}else if(path.endsWith("text")) {
			System.out.println("텍스트파일입니다.");
		}
		
	}else {
		System.out.println("디렉토리입니다.");
	}
	
	System.out.println(format(f1));
	
	File f2 = new File("C:\\dev\\test\\2021\\05\\18\\eclipse 2.zip");
	File f3 = new File("C:\\dev\\test\\2021\\05\\18\\eclipse 3.zip");
	
	f2.renameTo(f3);
	f3.delete();
	
	File f4 = new File("C:\\Users\\user\\Eclipse_WorkSpaces\\Java_Fundamental");
	File[]files = f4.listFiles();
	
	
	
	
	
	
	
}






}
