package java_20210506;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-(i+1); j++) {
				System.out.print("*");			
			}
			System.out.println();			
			
		}
	}

}
