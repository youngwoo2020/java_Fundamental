package java_20210503;

public class ForDemon {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			}
			System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		/*
		 * sum = 0; for (int i = 2; i <=10; i+=2) { sum = sum + i; }
		 * System.out.printf("1부터 10까지 짝수 합은 %d 입니다.", sum); }
		 */
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);

		for (int first = 2; first < 10; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d*%d = %d %n", first, second, first * second);
			}
		}
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			// j = 2 ,  j<i $ 5줄 밑에 있는 count == 0 =>for loof가 돌아가는 횟수가 줄어든다
			// j<i/2    j*j<=i
			for (int j = 2; j<i; j++) {
				if (i % j == 0) {
					count++;
					//나눠지는 숫자가 있음으로 소수가 아니기 때문에 빠져나오면 된다.
					break;
				}
				totalIndex++;
			}
			if (count == 0) {
				totalCountOfPrimeNumber++;
				System.out.print(i + "\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
	}
}
