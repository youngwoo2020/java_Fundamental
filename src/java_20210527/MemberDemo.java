package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		// 멤버다오를 싱클턴으로 만들었기 때문에 getInstance로 객체생성
		MemberDAO dao = MemberDAO.getInstance();
		/*F
		 * int num = 12; String name = "김범수"; String addr = "한국"; MemberDTO dto = new
		 * MemberDTO(num, name, addr); boolean success = dao.insert(dto);
		 * 
		 * if (success = true) { System.out.println("insert 성공"); } else {
		 * System.out.println("insert 실패"); }
		 */
	/*	int num = 12;
		String name = "김범수1";
		String addr = "한국1";
		MemberDTO dto = new MemberDTO(num, name, addr);
		
		boolean success = dao.update(dto);

		if (success = true) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		/*
		
		/*int num = 12;
		boolean success = dao.delete(num);
		if (success = true) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		int start = 0;
		int len = 10;
		ArrayList<MemberDTO> list = dao.select(start, len);
		for(MemberDTO dto : list) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d, %s, %s %n", num, name, addr);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
