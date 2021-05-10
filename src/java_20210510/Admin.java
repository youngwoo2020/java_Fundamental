package java_20210510;
//public이 없으면 다른 패키지에서 사용할 수 없음.
public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자 : 매개변수가 없는 생성자 =>() 괄호 안에 없는 거!
	// 생성자=>[접근한정자(4가지)] [클래스이름] (){}
	// 생성자는 반환값x, class이름하고 똑같이 써야 함.
	// 생성자의 기능 : instance 변수 초기화.
	// 생성자의 {}바디 에 들어가는 값=> instance변수 설정 따라서 디폴트 생성자는 매개변수가 없기 때문에 할 일이 없음
	// 생성자는 오버로딩이 가능
	public Admin() {
		//super();
	}

	
	//this 의 용법2가지
	//1. 자기자신 객체 this or this. =>위치는 메서드, 생성자 모두 사용
	//2. 다른 생성자를 호출 this(매개변수) => 위치는 생성자에서만 사용 
	public Admin(String id, String pwd, String email) {
		this(id,pwd,email,0);
	}
	/*public Admin(String id, String pwd, String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	} 위에 코딩과 같음   4개짜리에서 3개짜리로!  
	반드시 위에처럼 코딩할 필요는 없음, 에를 들어 인스턴스 변수가 100개인데 초기화 할 값이 2개 정도이면, 아래처럼 초기화하는 것이 나음.       
	*/
	
	public Admin(String id, String pwd, String email, int level) {
		//super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setlevel(int level) {
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}
}
