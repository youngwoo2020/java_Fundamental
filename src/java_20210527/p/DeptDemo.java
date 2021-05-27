package java_20210527.p;

import java.util.ArrayList;

public class DeptDemo {
public static void main(String[] args) {
	DeptDao dao = DeptDao.getInstance();
	int start =0;
	int len = 10;
	
	ArrayList<DeptDto> list = dao.select(start,len);
	for(DeptDto dto : list) {
		int no = dto.getNo();
		String name = dto.getName();
		String loc = dto.getLoc();
		System.out.printf("%d,%s,%s %n",no,name,loc );
	}
}



}
