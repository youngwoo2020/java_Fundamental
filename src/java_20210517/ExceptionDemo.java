package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
public static void main(String[] args) {
	//java.lang.NumberFormatException = > runtimeException
	//111a=>예외처리를 해야 함 : 컴파일 단계 시에 에러가 안나는데 실행시에 에러 발생(사용자로부터 자료를 받은 경우)
	//12.34 => 코드를 변경해야 함. 
	int i = Integer.parseInt("1111"); ////111a
	System.out.println(i);
	//java.lang.NumberFormatException
	double d = Double.parseDouble("12.34"); //12.34a
	System.out.println(d);
	
	// java.lang.ArrayIndexOutOfBoundsException 배열의 인덱스에 문제가 생긴 경우
	//배열에서 범위를 벗어나면 발생하는 예외 => 코드를 변경해야 함. 
	int[] a = {1,2,3,4};
	System.out.println(a[1]); //a[4]
	
	// java.lang.IndexOutOfBoundsException
	//collection에서 범위를 벗어나면 발생하는 예외
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(123); //auto-boxing
	System.out.println(list.get(0));  //get(1)
	
	// java.lang.NullPointerException
	//객체를 생성하지 않고 메서드를 사용하면 발생하는 예외 =>배열 등등에서 나타나는 오류
	String str = "str";  //null
	System.out.println(str.length());
	
	// java.lang.ArithmeticException
	int b = 10;
	int c = 1; //0
	System.out.println(b/c);
}
}
