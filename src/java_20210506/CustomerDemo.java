package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer();
		c1.name = "권영우";
		c1.age = 20;
		c1.email = "youngwoo2020@naver.com";
		c1.phone = "010-0000-0000";
		c1.balance = 1_000_000;
		c1.released = false;
		Customer.interestRate = 6.2;
		System.out.printf("%s,%d,%s,%s,%f,%s %n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);

		Customer c2 = new Customer();
		c2.name = "장민호";
		c2.age = 30;
		c2.email = "mino@naver.com";
		c2.phone = "010-1234-1234";
		c2.balance = 1_000_000_000_000l;
		c2.released = false;
		// 변수로도 접근 가능하나 권장하지 않음 ex) c1.interestRate //class변수(static 변수)는 클래스 이름으로 접근하는
		// 것이 관례
		Customer.interestRate = 8.2;
		System.out.printf("%s,%d,%s,%s,%f,%s%n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);

		Customer c3 = c2; // reference 참조
		
		
		c3.name = "손정의";
		System.out.printf("%s ,%s%n", c2.name, c3.name);
		System.out.printf("%f%n", Customer.interestRate);
		System.out.printf("%s", Customer.BANKNAME); // final 변수는 값을 재할당 할 수 없음

	}

}
