package java_20210514;

import java.util.ArrayList;

public class MemberManager {

	private ArrayList list; // 저장할 공간을 ArrayList로 설정을 하는 것.

	public MemberManager() {
		list = new ArrayList(); //list를 한번만 생성해야하기 때문에 생성자 안에다가 넣는거임. 만약 생성자 안에다 넣지 않으면 객체를 생성할 때마다 새로운 list가 만들어지기 때문에 말짱 도루묵이 됨.
	}

	public void insert(String id, String name, int age) {
		list.add(new Member(id, name, age));
	}

	public void update(String id, String name, int age) {
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				//list.remove(i);
				//list.add(i, new Member(id, name, age)) 
		
				m.setAge(age);
				break;
			}
		
		}
	}

	public void delete(String id) {
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		
		}
	
	}

	public ArrayList select() {
		return list;
	}

	public void select(String id) {
		Member member = null;
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())){
				member = m;
				break;
			}
			}
	}
	
	
	
	

}
