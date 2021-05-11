package java_20210511;
class A{
	int a;
	A(int a){
		//super();가 숨어있음
		this.a = a;
	}
	
	
}
class B extends A{
	B(){
		super(10); //A클래스의 1개짜리 인스턴스를 10으로 초기화 하겠다는 뜻.
	}
	
}
//클래스는 하나의 프로그램에 여러개 만들 수 있는데, public은 파일명과 같은거 하나밖에 못붙임.
public class SuperDemo {
	public static void main(String[] args) {
	B b = new B();	
	System.out.println(b.a);
	}
}
