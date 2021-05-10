package java_20210510;

public class CallByValue {

	public static void ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-(i+1); j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
	} 
	}
	
	
	int[] lotto = { 3, 5, 12, 45, 23, 1 };
	ascending(lotto);
	for (int value : lotto) {
		System.out.print(value + "\t");
	}
	}
	
}
