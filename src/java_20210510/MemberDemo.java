package java_20210510;

public class MemberDemo {
	public static void print(Member m) {


		System.out.println(m.getName());
		System.out.println(m.getEmail());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getAge());
	}

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("권영우");
		m.setEmail("youngwoo2020@naver.com");
		m.setZipcode("09256");
		m.setAddr1("서울");
		m.setAddr2("서초");
		m.setAge(26);
		print(m);

	}
}
