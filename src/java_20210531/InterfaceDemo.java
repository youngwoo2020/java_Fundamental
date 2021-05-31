package java_20210531;

public class InterfaceDemo {
public static void main(String[] args) {
	InterA i = new ImplementClass();
	i.mA();
	i.mB();
	System.out.println(InterA.PI);
}
}

