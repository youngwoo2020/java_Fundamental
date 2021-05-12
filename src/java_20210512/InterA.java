package java_20210512;

public interface InterA extends InterB, InterC{ 
	// b와 c를 a가 상속받았으므로 interface a를 상속받는 클래스는 a,b,c 모두 오버라이딩 해야함

	//인터페이스의 변수는 public static final이 생략되어 있음
	//interface 이름.변수
	public static final double PI = 3.14;
	//인터페이스의 접근 한정자를 붙이지 않으면 public 생략되어 있음
	//abstract 생략 가능
	public abstract void mA();
}
