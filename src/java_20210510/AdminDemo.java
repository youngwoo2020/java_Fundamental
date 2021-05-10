package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		// 컴파일러가 디퐅트 생성자를 자동으로 만들어줌 but 어드민 클래스에서 생성자를 (디폴트 이외) 만드는 순간 컴파일러가 디폴트 생성자를
		// 만들지 않음.
		// 어드민 클래스의 디폴트 생성자를 public->default로 만들면 에러남. (같은 클래스가 아니기 때문에)
		// 생성자는 대부분 public
		// 생성자를 통해 객체를 생성하지 못하게 할 수 있음 =>private 예)Math 클래스(거의 없음)
		//생성자의 접근 한정자는 인슨턴스(new)의 유무를 결정한다. 
		//어드민 a에서 에러가 나면 class가 디폴트로 되어 있고, 패키지가 달라졌기 대문
		//뉴 어드민에서 에러가 나면 생성자의 접근한정자가 문제;
		// 뉴 어드민은 매개변수 없는 생성자를 호출. 앞에 디폴트 생성자가 없으면 에러남.
		Admin a = new Admin("skznjs","123","youngwoo2020@naver.com",2);
		//만약 생성자가 없으면 하나하나 다 코딩해야 함
		/*Admin a1 = new Admin();
		a1.setId("skznjs"); 
		a1.setPwd("123") 등등등*/
		System.out.println(a.getId());
		System.out.println(a.getEmail());
		System.out.println(a.getPwd());
		System.out.println(a.getLevel());
	}
}
