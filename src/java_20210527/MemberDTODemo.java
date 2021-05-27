package java_20210527;

import java.lang.reflect.Member;
import java.util.Set;

public class MemberDTODemo {
	public static void main(String[] args) {
		MemberDTO dto1 = new MemberDTO();
		System.out.println(dto1.getNum());
		System.out.println(dto1.getName());
		System.out.println(dto1.getAddr());
		
		//생성자 사용 X
		MemberDTO dto2 = new MemberDTO();
		dto2.setNum(10);
		dto2.setName("성영한");
		dto2.setAddr("서울");
		System.out.println(dto2.getNum());
		System.out.println(dto2.getName());
		System.out.println(dto2.getAddr());
		
		
		//매개변수 3개짜리 생성자 호출
		MemberDTO dto3 = new MemberDTO(10,"성영한","서울");
		System.out.println(dto3.getNum());
		System.out.println(dto3.getName());
		System.out.println(dto3.getAddr());
	}
}
