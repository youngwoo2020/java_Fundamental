package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0.0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		// 2.2가 나와야 하는데 2가 나옴
		c = b / a;
		System.out.println(c);

		// (b/a)자체가 인트값이라 2.0 이 나옴
		d = (double) (b / a);
		System.out.println(d);

		// 값중에 하나만 캐스팅을 해도 큰쪽을 따라가기 때문에 한쪽만 캐스팅을 해도 됨
		d = (double) b / a;
		System.out.println(d);

		// 나머지 연산자
		c = b % a;
		System.out.println(c);

		// 벅함대입연산자

		a += b; // a=a+b
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// sum = sum +1;
			sum += i;
		}
		System.out.println(sum);

		// 증감 연산자
		a = 10;
		b = 20;

		a++;
		++b;

		System.out.println(a);
		System.out.println(b);

		a = 10;
		// 대입후증가
		c = a++;
		System.out.println(c);

		a = 10; // a를 10으로 초기화한다. = 값을 설정할 때 초기화한다고 한다.
		// 증가한 후 대입 tlqkf무슨말이고 이게
		c = ++a;
		System.out.println(c);

		a = 10;
		b = 20;

		boolean isSuccess = a > b;
		System.out.println(isSuccess);

		if (a > b) {
			System.out.println("a가 b보다 크다.");
		} else {
			System.out.println("a가 b보다 작다.");
		}

		d = 10.0;
		isSuccess = a == d;
		System.out.println(isSuccess);

		// 논리연산자
		a = 10;
		b = 20;
		// A && B => A가 false이면 B를 연산하지 않음(short circuit 발생)
		// A || B => A가 true이면 B를 연산하지 않음(short circuit 발생)
		// isSuccess = (a==b) && (++a == b++);
		isSuccess = (a == b) || (++a == b++);

		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		int z = 125900;
		double x = 125234.789;
		String name = "권영우";

		// %d의 개수만큼 콤마 뒤에 나오면 됨
		// 정수형은 %d 실수형은 %f 문자열을 %s
		System.out.printf("z는 %d 입니다.%n", z);
		// .2 => 소숫점이하 두번째자리 까지 표시하고 반올림 ,=> 세자리수에 콤마
		System.out.printf("x는 %,.2f 입니다.%n", x);
		System.out.printf("저는 %s, %d , %f 입니다.%n", name, z, x);

		// 삼항연산자(조건연산자) if 로 코딩하는 대신 한줄로 함
		// if문
		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}

		System.out.println(msg);
		// 삼항연산자
		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);

	}
}
