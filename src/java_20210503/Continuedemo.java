package java_20210503;

public class Continuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6) continue;
				  //if(i!==6) 이랑 똑같음
			sum += i;
		}
		System.out.println("합은 : " + sum);

		
		
		
	}

}
