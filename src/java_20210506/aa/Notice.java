package java_20210506.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;

	public static void main(String[] args) {

		Notice n = new Notice();
		n.number = 1; // public은 서로 다른 패키지에서 접근 가능
		n.title = "공지사항입니다."; // protected 서로 다른 패키지 이면서 상속 받은 경우만 접근 가능
		n.hit = 0; // default 같은 패키지 내에서 접근가능
		n.regdate = "2021-05-06"; // private 같은 class내에서 접근 가능
		
	}

}
