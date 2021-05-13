package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음. 
		//HashSet set = new HashSet();
		//TreeSet => 오름차순 정렬
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 
		//natural ordering(숫자일때와 문자일때 정렬방식이 다름)
		TreeSet set = new TreeSet();
		

		//TreeSet ->문자열과 숫자열 출력 방식이 다름. 문자열 정렬은 1과 관련된것부터 정렬됨.
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("1");
		set.add("11");
		set.add("1244");
		set.add("4");
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet를 Iterator로 변환해서 출력해야 함.
		Iterator i = set.iterator();
		//hashNest() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		while(i.hasNext()) { //초기값, 증감이 없기 때문에 for문이 아니라 while문을 씀.
			String temp = (String)i.next(); //해당 객체를 가져온다. 
			System.out.println(temp);
			
			
			
			
			TreeSet lottoSet = new TreeSet();
			while(true) {
				int random = (int)(Math.random()*45)+1;
				lottoSet.add(random);
				if(lottoSet.size()==6)break;
			}
			Iterator i2 = lottoSet.iterator();
			while(i2.hasNext()) {
				Integer temp1 = (Integer)i2.next();  //Integer.valueOf(i2.next()) 인거임.  앞에 템프는 int temp로 쓸수 있음 (자동 언박싱)
				System.out.print(temp1+"\t");
			}
		
		
		}	
	}
}
