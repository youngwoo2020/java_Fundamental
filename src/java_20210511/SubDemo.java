package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		sub.play("~~");
		
		
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~~"); //Play를 오버라이딩했기 때문에 sub의 play가 호출됨

		System.out.println(sub);
		System.out.println(sub.toString()); //toString은 오브젝트에 있는 것, sub에서 오버라이딩하면 다른거로 나옴. .toString이 생략되어 있음.
		
		Object obj = new Sub();
		//오브젝트에 투스트링 메서드가 있는데, 서브에서 투스트링 메서드를 오버라이딩했기 때문에 "서브클래스입니다"라는 메세지가 나오는 것.
		//.toString을 생략해도 됨.
		System.out.println(obj.toString());
		
	}

}
