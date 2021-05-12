package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		// ctrl+shift+o =>자동임포트
		// 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에 primitive data
		// type을 객체화 할 수 있는
		// Wrapper Class로 변환하여 저장해야 했다.
		// 아래와 같이 1을 저장할 수 없음.(1.4버전) ->5.0이후에는 boxing 작업이 내부적으로 일어나서 오류가 나지 않음. 
		ArrayList list = new ArrayList();
		// list.add(1);
		list.add(new Integer(1));

		// primitive data type을 wrapper class로 변환할 수 있어야 한다(valueOf 이용)
		Integer i1 = Integer.valueOf(10); // primitine 10을 래퍼클래스로 바꾼것
		Integer i2 = Integer.valueOf("20"); // String 문자열을 래퍼클래스로 바꾼것

		// wrapper class를 primitive data type으로 변환할 수 있어야 한다. (intValue()이용)
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		int i5 = i3+i4; 
		
		//숫자로 구성된 String을 primitive data type으로 변환 (Integer.parseInt("10")
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
		System.out.println(i6);
		
		//AUTO BOXING => 프리미티브 데이타 타입이 랩퍼클래스로 변환
		Integer i7 = 100; //.intValue();가 생략된 것.(버전이 업데이트 되면서 자동 컴파일)
		Integer i8 = 200;
		//auto unboxing => wrapper class->primitive
		int i9 = i7+i8;

	}

}
