package java_20210517;

//보통 사용자 정의 예외는 exception을 상속받는다. 
public class IncorrectAccountException extends Exception {

	public IncorrectAccountException(String message) {
		super(message);// TODO Auto-generated constructor stub
	}

}
