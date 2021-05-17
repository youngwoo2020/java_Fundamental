package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
public static void main(String[] args) {
	MemberManager m = new MemberManager();
	m.insert("skznjs1","권영우1",21);
	m.insert("skznjs2","권영우2",22);
	m.insert("skznjs3","권영우3",23);
	m.insert("skznjs4","권영우4",24);
	
	ArrayList list = m.select();
	for (int i = 0; i < list.size(); i++) {
		Member m2 = (Member)list.get(i);
		System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
	}
	System.out.println("===========================================================");
	
	
	m.delete("skznjs1");
	for (int i = 0; i < list.size(); i++) {
		Member m2 = (Member)list.get(i);
		System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
	}
	System.out.println("===========================================================");
	
	m.update("skznjs1","권영우1",28);
	for (int i = 0; i < list.size(); i++) {
		Member m2 = (Member)list.get(i);
		System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
	}
	System.out.println("===========================================================");
	
	//Member m3 = m.equals("skznjs2");
	//System.out.printf("%s,%s,%d %n ", m3.getId(), m3.getName(), m3.getAge());
	
	
}
}
