package java_20210504;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hi
	int[] lotto = new int[6];
	for (int i = 0; i < lotto.length; i++) {
		int random = (int)(Math.random()*45+1);
		boolean isExisted = false;
		for (int j = 0; j < i; j++) {
			if(random==lotto[j]) {
				isExisted = true; break;
			}	
		}
		//jj
		if(isExisted) {
			i--;
		}else {
			lotto[i]=random;
		}
	}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length -(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j]= lotto[j+1];
					lotto[j+1] = temp;
				}
			}
			
		}
	
	
		for (int i = 0; i < lotto.length; i++) {
		System.out.print(lotto[i]+"\t");
		
	}	
	}

}
