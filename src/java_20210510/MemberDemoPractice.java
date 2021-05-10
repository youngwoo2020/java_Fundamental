package java_20210510;

public class MemberDemoPractice {

	private static void print(MemberPractice m1) {
		System.out.println(m1.getName());
		System.out.println(m1.getAddr());
		System.out.println(m1.getAge());
		System.out.println(m1.getPhonenumber());
	}

	public static void main(String[] args) {

		MemberPractice m1 = new MemberPractice();
		m1.setName("권영우");
		m1.setAddr("서울서초");
		m1.setAge(26);
		m1.setPhonenumber("010-9161-4252");
		
		print(m1);
	}
}
