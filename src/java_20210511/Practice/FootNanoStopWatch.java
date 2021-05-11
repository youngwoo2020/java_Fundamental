package java_20210511.Practice;
//요구사항 : 밀리 세컨드로 결과 시간을 만들어 주세요. 
//요구사항1 : 나노세컨드로 경과시간을 만들어주세요.
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}
	public static void main(String[] args) {
	FootNanoStopWatch f = new FootNanoStopWatch();
	f.startTime = System.nanoTime();
	for (long i = 0; i < 300_000_000_000l; i++) {

		}
	f.endTime = System.nanoTime();
	
	double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);		
	}
}
