package java_20210512;
  
class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
}



public class ObjectDemo {	
	public static void main(String[] args) {
		Test t1 = new Test("권영우");
		Test t2 = new Test("권영우");
		Test t3 = t2;
		System.out.println(t1==t2); //객체를 비교하기 때문에 false
		System.out.println(t1.equals(t2)); //위에서 오버라이딩했기 때문에 true(내용이 같음)
		System.out.println(t2.equals(t3));
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1); //t1.toString이 생략되어 있음. toString은 해쉬코드를 나타내는 값. 오버라이딩하면 됨. 디버깅 목적으로 쓰임.
	}
}
