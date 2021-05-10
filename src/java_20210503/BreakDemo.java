package java_20210503;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// for 문의 이름 : aa => break쓸 때 이름을 써줘야 함
		aa: for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break aa;
			sum += i;
		}
		System.out.println("합은 : " + sum);

		// break 나가는 for문에 따라 결과가 달라짐
		outter: for (int i = 2; i < 10; i++) {
			inner: for (int j = 1; j < 10; j++) {
				if (i == 4 && j == 8)
					break outter;
				System.out.printf("%d *%d = %d %n", i, j, i * j);
			}
		}
	}

}
