package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	//HashMap : key값은 유일해야 하고, value는 객채의 중복을 허용함. 
	HashMap map = new HashMap();
	//할당=>put(add가 아님)
	map.put("a", "111");//왼쪽은 key, 오른쪽은 객채
	map.put("b", "222");
	map.put("c", "333");
	
	String value1 = (String)map.get("a"); // 반환값이 오브젝트이기 때문에 스트링으로 캐스팅
	String value2 = (String)map.get("b"); // 반환값이 오브젝트이기 때문에 스트링으로 캐스팅
	String value3 = (String)map.get("c"); // 반환값이 오브젝트이기 때문에 스트링으로 캐스팅
	
	System.out.printf("%s, %s, %s %n",value1, value2, value3);
	
	//map에 있는 내용을 모두 뽑는 방법.
	//반환값이 set, set안에 key가 저장되어 있음 = > set은 중복을 허용하지 않기 때문에 유일무이해야 하는 key를 저장해 넣은 것
	Set keySet = map.keySet();
	Iterator i = keySet.iterator();
	while(i.hasNext()) {
		String key = (String)i.next();
		String value = (String)map.get(key);
		
		System.out.printf("%S, %s %n", key, value);
	}
	
	
	
	
	
	
	
}
}
