package java_20210506.bb;

import java_20210506.aa.Notice;

public class NoticeDemo2 extends Notice { //Notice가 부모이고, NoticeDemon2가 자식

	public static void main(String[] args) {
		// 서로 다른 패키지의 클래스를 사용하기 위해서는 import 구분을 사용해야 한다. (두번째줄)
		// package => import => class 순으로 코딩해야 한다. (바뀌면 에러남)
		Notice n1 = new Notice();
		n1.number = 1; // public은 서로 다른 패키지에서도 접근 가능
		// n1.tile =""; protected 서로 다른 패키지에서 접근 하려면 상속받은 경우만 가능
		// n1.hit = 10; default 서로 다른 패키지에서 접근 불가능
		// n1.regdate = ""; private 서로 다른 패키지에서 접근 불가능

		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2;
		n2.title = ""; //protected 서로 다른 패키지에서 접근 하려면 상속받은 경우만 가능 =>public class NoticeDemo2 extends Notice
		// n2.hit = 10;
		// n2.regdate = "";
	}
}
