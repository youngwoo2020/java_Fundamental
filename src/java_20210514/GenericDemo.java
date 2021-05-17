package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
	    

		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i); // 제네릭으로 선언했기 때문에 String으로 캐스팅 할 필요가 없다 & enhance 문이 가능함.
			System.out.println(value);
		}
		for (String value : list) {
			System.out.println(value); //위의 코드와 같음. 
		}
	}
}
