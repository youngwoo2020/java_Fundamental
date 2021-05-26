package java_20210506;

public class star2 {
public static void main(String[] args) {
	
	int[]star = new int[5];
	for (int i = 0; i < star.length; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	star = new int[4];
	for (int i = 0; i < star.length; i++) {
		for (int j = 0; j <5-(i+1) ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
}
}
