package java_20210511.step3;

public class StopNanoWatch {
	long startTime;
	long endTime;

	public void startNano() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();

	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}
}
