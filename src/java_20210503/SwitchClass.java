package java_20210503;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) {
		//case값은 유일해야 한다 but 콤마를 사용해서 연결할 수는 있음
		case 12 : season = "겨울"; break;
	
		case 3 : season = "봄"; break;
		case 4 : season = "봄"; break;
		case 5 : season = "여름"; break;
		case 6 : season = "여름"; break;
		case 7 : season = "여름"; break;
		case 8 : season = "가을"; break;
		case 9 :season = "가을"; break;
		case 10 : season = "가을"; break;
		case 11 : season = "겨울"; break;
		default: season ="없는 계절";	
		}
		System.out.println(month + "월은" + season +"입니다.");
	}

}

