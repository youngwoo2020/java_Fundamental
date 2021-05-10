package java_20210510;

public class MenberPay {

	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;

	
	
	//seq에 대한 setter =>seq를 수정할 때 사용 (무조건 반환값이 없음)
	public void setSeq(int seq) {
		//this를 사용한 이유는 로컬 변수와 맴버변수를 구분하기 위해서 사용 (생략불가)
		this.seq = seq; // 왽쪽은 맴버 변수고 오른쪽은 로컬 변수
	}
	//seq의 getter =>SEQ의 정보를 가져올 때 사용
	public int getSeq() {
		return seq;
	}
	
	//group의 setter
	public void setGroup(int group) {
		this.group = group;
	}
	//group의 getter
	public int getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price= price;
	}
	public int getPrice() {
		return price;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public boolean isValid() { //boolean만 get이 아닌is를 쓴다
		return valid;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	public String getStatus() {
		return status;
	}
	public void setSdate(String Sdate) {
		this.sdate = sdate;
		
	}
	public String getSdate() {
		return sdate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
		
	}
	public String getEdate() {
		return edate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
		
	}
	public String getRegdate() {
		return regdate;
	}
	
}
