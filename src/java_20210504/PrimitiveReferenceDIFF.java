package java_20210504;

public class PrimitiveReferenceDIFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		// promitive 변수를 할당하면 값이 할당 됨(참조 ㄴㄴ)
		int b = a;
		b = 30;
		System.out.println(a);
		System.out.println(b);

		int[] test = { 10, 20, 30, 40 };
		// reference 변수를 할당하면 같은 객체를 참조함
		int[] temp = test;

		System.out.printf("test[0] : %d,temp[0] : %d%n", test[0], temp[0]);
		System.out.printf("test[1] : %d,temp[1] : %d%n", test[1], temp[1]);
		temp[2] = 3000;
		System.out.printf("test[2] : %d,temp[2] : %d%n", test[2], temp[2]);
		
		System.out.println(temp);
		System.out.println(test);
		
	}

}
