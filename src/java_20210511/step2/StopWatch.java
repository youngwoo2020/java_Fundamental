package java_20210511.step2;

public class StopWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
		
	}
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}
	
	
	
	long startNanoTime;
	long endNanoTime;
	public void startNano() {
		startNanoTime = System.nanoTime();
	}
	public void stopNano() {
		endNanoTime=System.nanoTime();
		
	}
	
	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / 1000000000;
	}
}
