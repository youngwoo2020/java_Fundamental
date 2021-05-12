package java_20210512;


public class MathDemo {
	public static void main(String[] args) {
		double d = Math.ceil(4.3); //올림
		System.out.println(d);
		
		d= Math.floor(4.9); //내림
		System.out.println(d);
		
		int i=Math.round(2.6f); // 반올림 f에서 가장 가까운 int값 리턴
		System.out.println(i);
		
		long l = Math.round(4.2);  // double에서 가장 가까운 long값 리턴
		System.out.println(l);
		
		d=Math.abs(-4.2);
		System.out.println(d); //double이면 double로 리턴
		
		l=Math.abs(-121214l);
		System.out.println(l);
		
		d=Math.max(4.2, 5.2);
		System.out.println(d);
		
		d= Math.sqrt(2); //제곱근
		System.out.println(d);
		
		l=(long)Math.pow(2.0, 3.0); //승수이기 때문에 소수점 이하가 안나옴. long으로 캐스팅하쟈
		System.out.println(l);
		
		d=Math.random();
		System.out.println(d);
	}
}
