package java_20210517;

import java.util.Iterator;

public class ThreadDemo_8 extends Thread{//java.lang. *이 원래 생략되어 있기 때문에 쓰레드는 따로 임포트 할 필요없음. 
	

	public ThreadDemo_8(String ThreadName) {
		super(ThreadName);
		// TODO Auto-generated constructor stub
	} 
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n",threadName,i);
		}
	}
	public static void main(String[] args) {
		System.out.println("=================start=======================");
		//Thread 클래스 만드는 방법
		//1. THREAD 클래스를 상속받는다. 
		//2. RUN() 메서드를 오버라이딩한다. 
		//3. 스레드를 상속받은 객체를 생성한다. 
		//4. 객체가 생성되었다면 start()메서드를 호출한다. 
		ThreadDemo_8 t1 = new ThreadDemo_8("첫번째 스레드");
		t1.start();
		ThreadDemo_8 t2 = new ThreadDemo_8("두번째 스레드");
		t2.start();
	
		System.out.println("==================end========================");
		
	}
}
