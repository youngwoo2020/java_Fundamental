package java_20210510;

public class VarArgDemo {
	public long sum(int... temp) { // variable이 없으면 sum을 오버로딩 해야한다
		//정확한 갯수를 알고 있다면 오버로딩을 하고, 정확히 알 수 없을 때 variable arg를 쓰자! 오버로딩을 목적으로 var를 쓰는게 아님.  
		long sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		VarArgDemo v = new VarArgDemo();
		long s1 = v.sum(10, 20);
		System.out.println(s1);
		s1 = v.sum(80, 90, 75, 95);
		System.out.println(s1);
	}
}
