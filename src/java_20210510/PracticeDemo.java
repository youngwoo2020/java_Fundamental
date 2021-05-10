package java_20210510;

public class PracticeDemo {
public static void print(Practice p) {
	String name;
	int age;
	System.out.print(p.getName());
	System.out.print(p.getAge());
	
}
public static void main(String[] args) {
	Practice p = new Practice();
	p.setName("장민호");
	p.setAge(28);
	print(p);
}
}
