package java_20210511;

public class Sub extends Super {
	String chicken; //이름이 다르기 때문에 super로 접근할 수가 없음.
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	//overriding :  부모의 메서드를 재정의
	//1. 반환형, 메서드이름, 매개변수가 모두 일치
	//2. 접근한정자는 부모보다 자식이 상위이거나 같으면 된다. 
	public void play(String starcraft) {
		//super.play("badook");  부모의 기능에 쁠러스
		System.out.println("Sub play(~) 호출");
	}
	public String toString() {
		return "서브클래스입니다.";
	}
}
