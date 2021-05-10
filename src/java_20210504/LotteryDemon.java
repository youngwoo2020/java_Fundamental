package java_20210504;

public class LotteryDemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오름차순 정리 [0]과 [2]를 비교해서 왼쪽이 작으면 내버려두고, 크면 swich [0]부터 [5]까지 비교하고 [0]고정, [1]부터
		// [5]까지 비교하고 [1]고정

		// Math.radom() => 0보다 크거나 같고 1보다 작은 임의 double 반환

		// int random = (int)(Math.random() * 45 +1); //0보다 크고 45보다 작은 double값을 반환 =>
		// int로 캐스팅 (양변 다)하고 +1을 하면 1~45의 정수
		// System.out.print(random);

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if(random==lotto[j]) {
					isExisted = true; break;
				}	
			}
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
		

		// a[0]와 a[3]을 바꾸는 문법
		int[] a = new int[4];

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;

		int a0 = a[0];
		int a3 = a[3];
		a[0] = a3;
		a[3] = a0;

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];

			System.out.println(temp);
		}

	}

}
