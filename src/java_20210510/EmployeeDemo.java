package java_20210510;

public class EmployeeDemo {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.name = "권영우"; //Employee 부모 클래스인 Customer의 모든 멤버변수를 사용할 수 있음
	e1.phone1 = "010";
	e1.phone2 = "9161";
	e1.phone3 = "4252";
	e1.zipcode = "123";
	e1.addr1 = "서울";
	e1.addr2 = "서초";
	e1.id = "skznjs";
	e1.pwd = "1234";
}
}
