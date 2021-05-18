package java_20210518;

public class SynchronizedDemo implements Runnable { // 이미 스레드 프로그램을 만들었는데 일반 프로그램처럼 돌리기 위해 synchronized를 사용하는 것ㄷㄱㄷ
	int x;
	int y;

	public void run() { // public synchronized void run()
		synchronized (this) { // this =>synchronizedDemo.class

			for (int i = 0; i < 1000; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d-%s%n", x, y, threadName);
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1); // 서로 같은 객체를 돌리면 2000 으로 끝남. (객체를 공유하기 때문에)
		// 서로 같은 객체를 공유해야만 synchronized가 가능함.
		t1.start();
		t2.start();
	}
}
