package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / 2;
		return avg;
	}

public static void main(String[] args) {
	try {
		//javac TryCatchDemo.java => compile
		//java TryCatchDemo 10 20 30 =>실행할 때 배열로 들어옴.(실행때 인자-아규먼트를 넣어야함)
		//run configurations => Arguments -> program Arguments에 띄어써서 인자를 입력해야 함. 
		//10,20 ->정상으로 돌아감
		//10, a -> java.lang.NumberFormatException
		//10 ->  java.lang.ArrayIndexOutOfBoundsException
	
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
	
		double average = getAvgs(korean, english);
		System.out.printf("국어와 영어의 평균 점수는 %.1f입니다.", average);
	}catch(NumberFormatException e){
		//catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다. 
		//1. error메세지를 출력(개발자가 보기 위한 목적)-개발단계에서
		//2. error메세지를 출력(사용자가 보기 위한 목적)-서비스 단계에서
		//e.printStackTrace(); =>메서드 안에 출력이 포함되어 있음. 
		System.err.println(e.getMessage()); //예외메세지를 출력할때는 err로, 정상적인 메세지는 out으로 코딩
		System.out.println("문자말고 숫자를 넣어주세요");
		
	}catch(ArrayIndexOutOfBoundsException e) {
		
		//e.printStackTrace(); =>메서드 안에 출력이 포함되어 있음. 
		System.err.println(e.getMessage()); //예외메세지를 출력할때는 err로, 정상적인 메세지는 out으로 코딩
		System.out.println("인자가 2개 필요해!");
	}finally {
		System.out.println("무조건 수행되는 블럭-finally");
	}
}
}
