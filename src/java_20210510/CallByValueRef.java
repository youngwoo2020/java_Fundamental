package java_20210510;
//import java.lang.*; 가 생략되어 있음.
public class CallByValueRef {//extends Object가 생략되어있음.

	public static void ascending(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 3, 4 };
		System.out.println(i + j[3]);
		change(i, j);
		System.out.println(i + "," + j[3]);

		int[] lotto = { 3, 5, 12, 45, 23, 1 };
		ascending(lotto);
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}
}
