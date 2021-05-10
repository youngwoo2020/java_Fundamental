package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		System.out.println("instance method m1() 호출");
	}

	public void m2() {
		// instance method에서는 모든 변수를 사용하고, 모든 메서드를 호출할 수 있다.
		this.name = "권영우"; // this. =>자기자신 인스턴스 (같은 클래스 내에 있기 때문에 생략가능)
		StaticMethodDemo.interestRate = 1.2; // =>스테틱 변수는 앞에 클래스명.이 생략되어 있음.
		this.m1();
		m3();

	}

	public static void m3() { // 이자율을 전체적으로 올릴때 스테텍 메서드를 사용하기도 함. 실제 코딩에서는 사용할 일이 별로 없음.
		System.out.println("static method m3() 호출");

	}

	// static 메서드 에서는 static 변수와 static 메서드만 사용할 수 있음
	public static void m4() {
		// name = "홍길동"; =>에러남
		interestRate = 2.2;
		// m1(); =>에러남
		m3();
	}

	public static void main(String[] args) { // static에서는 this를 쓸 수가 없음.
		// 이 상태에서 호출할 수 있는 것은 interest, m3,m4밖에 없음
		m3();
		m4();
		interestRate = 2.2;
		// 새로운 instance를 생성해야함.
		StaticMethodDemo smd = new StaticMethodDemo();

		smd.name = "장민호";
		smd.m1();
	}
}
