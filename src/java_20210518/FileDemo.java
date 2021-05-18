package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {

	public static String format(File f) {
		// 1970 1월 1일 00시 00분 00초부터 파일을 수정한 날까지의 시간을 밀리세컨드로 반환한 값
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);// 마지막 수정 날짜로 바꿈

		// 날짜를 바꿔주는 메서드
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

		// 칼렌다 타입으로 할 수가 없기 때문에 데이트 타입으로 바꿔줘야 함. 칼렌다를 데이트 타입으로 바꿔주는 메서드가 getTime()
		String format = sdf.format(cal.getTime());
		// 마지막 수정 날짜를 만드는 메서드로 만둘 수 있음.=>해보자
		return format;
	}

	public static void main(String[] args) {
		// 디렉토리를 만드는 방법
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		if (f1.mkdirs()) {
			System.out.println("디렉토리를 생성했습니다");
		} else {
			System.out.println("이미 디렉토리가 존재합니다");
		}

		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		long len = f2.length();
		System.out.printf("%,dKB%n", len / 1024); // 바이트를 킬로바이트로 나누는 것은 1024
		boolean isFile = f2.isFile();// isDirectory()
		if (isFile) {
			String path = f2.getPath();
			if (path.endsWith("zip")) {
				System.out.println("압축파일입니다.");
			} else if (path.endsWith("text"))
				System.out.println("텍스트파일입니다.");

			System.out.println("파일입니다.");
		} else {
			System.out.println("디렉토리 입니다.");
		}

		// 위의 수정날짜 구하는 메서드 호출
		System.out.println(format(f2));

		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");

		File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");

		f3.renameTo(f4); // f3파일을 f4파일 이름으로 변경

		String path = f4.getPath(); // 경로전체
		String parent = f4.getParent(); // 앞의 위치만
		String name = f4.getName(); // 파일이름만
		System.out.printf("%s, %s, %s %n", path, parent, name);

		f4.delete();

		File f5 = new File("C:\\Users\\user\\Eclipse_WorkSpaces\\Java_Fundamental");
		File[] files = f5.listFiles();
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if (f.isDirectory()) {
				String lastModified = format(f);
				String fileName = f.getName();
				System.out.println(f.getName());
				System.out.printf("%s, %s, 파일폴더 %n ", fileName, lastModified);
			} else if (f.isFile()) {
				String lastModified = format(f);
				String fileName = f.getName();
				long fileSize = f.length();
				System.out.printf("%s, %s, 파일,%,dB %n", fileName, lastModified, fileSize);

			}
		}
	}

}
