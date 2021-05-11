package java_20210511.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}
	public static void main(String[] args) {
	FootStopWatch f = new FootStopWatch();
	f.startTime = System.currentTimeMillis();
	for (long i = 0; i < 300_000_000_000l; i++) {

		}
	f.endTime = System.currentTimeMillis();
	
	double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.3f", elapsedTime);		
	}
	
	}
