package java_20210528;

import java.util.ArrayList;

public class EmpDao {

	private static EmpDao kwon;

	private EmpDao() {

	}

	public static EmpDao getInstance() {
		if (kwon == null) {
			kwon = new EmpDao();
		}
		return kwon;
	}
	
	
	public boolean insert(EmpDto dto) {
		boolean success = false;
		return true;
	}
	
	public boolean update(EmpDto dto) {
		boolean success = false;
		return true;
	}
	
	public boolean delete(int no) {
		boolean success = false;
		return true;
	}
	
	public ArrayList<EmpDto> select(int start, int len){
		ArrayList<EmpDto> listsss = new ArrayList<EmpDto>();
		return list;
		
	}
}














