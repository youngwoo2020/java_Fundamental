package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		//String으로 하는게 일반적인데, char로도 할 수 있음
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String str = new String(c);
		System.out.println(str);
		//문자열에서 특정한 문자 하나를 뽑아내는 기능 charAt
		//index는 0부터 시작
		char c1 = str.charAt(1); 
		System.out.println(c1);
	
		//문자열 연결하는 메서드
		str = str.concat("123");
		System.out.println(str);
		
		str = new String("abc.zip");
		//endsWith(String msg)=>msg문자열로 끝나면 true, 그렇지 않으면 false
		if(str.endsWith("zip")){
			System.out.println("압축파일입니다.");
		}else if(str.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일입니다.");
		}
		//startsWith(String msg)=>msg문자열로 시작하면 true, 그렇지 않으면 false
		String url = new String("hppt://www.naver.com");
		String path = new String("/news/board/do?id=123&cat=1");
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지입니다.");
		}else if(path.startsWith("/sports")){
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals()=> 문자열 비교
		//equalsIgnoreCase => 대소문자 비교하지 않음
		
		//화이트 스페이스대문에 결과값이 false가 나옴. =>.trim() 앞뒤 공백을 제거해줌
		String m1 = new String("hello ").trim();
		String m2 = new String("hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// getBytes()=>문자열을 byte로 반환하는 메서드
		String m3 = new String("안녕하세요.");
		byte[] b = m3.getBytes();
		System.out.println(b.length); 
		
		String m4 = new String("111111-1111118");
		System.out.println(m4.indexOf("-"));
		
		String m5 = new String("a.b.c.zip");
		//마지막에 있는 "."이 어디있는지 찾는 메서드
		System.out.println(m5.lastIndexOf("."));
		System.out.println(m5.substring(0,m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
		//커서로 위치 확인
		System.out.println(m4.substring(0,m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-")+1));
		
		String m6 = new String("010-3024-9999");
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1,m6.lastIndexOf("-")));	
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		
		
		//문자열을 int로 바꿔야함. Integer.parseInt
		int a1 = Integer.parseInt(m4.substring(0,1));
		String m7 = 123+""; //123을 문자열로 바꿈(없어보임ㅋ)
		String m8 = String.valueOf(123); //위의 열과 같은 코딩 static메서드이기 때문에 클래스이름으로 접근. 
		
		//String 교체 메서드
		String m9 = m6.replaceAll("-", "_");
		System.out.println(m9);
		
		String m10 = new String("hello");
		String m11 = m10.toUpperCase();
		System.out.println(m11);
		String m12 = m11.toLowerCase();
		System.out.println(m12);
		
		//split은 문자열을 쪼개는 거니까 배열로 받음
		String[] temp = m6.split("-");
		for(String value : temp) {
			System.out.println(value);
		}
		
		//010-1234-1234 => (010) => 토큰이라고 부름 -=>딜리미터라고 부름(구분자)
		double d = 123456.345;	
		String m13 = String.format("%,.2f",d);
		System.out.format("%s%n",m13);
		
		//StringBuffer => 해쉬코드가 오버라이딩 되어있지 않기 때문에 .equal을 하면 false가 나옴. 
		
		
	}
}
