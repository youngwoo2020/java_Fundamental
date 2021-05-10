package java_20210504;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언, 생성
		//배열 크기를 선언한 것보다 길게 하면 기본값인 0이 출력된다.
		int[] a = new int[4];
		
		//배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//배열 출력
		for (int i =0; i< a.length; i++) {
			int temp = a[i];
			System.out.println(temp);
		}
		//배열 선언, 생성, 할당이 동시에 이루어진 것.
		int[]b = {100,200,300,400};
		
		for (int i =0; i< b.length; i++) {	
			System.out.println(b[i]);
		}
		
		//달력
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		//9월 15일까지 일수를 구하세요
		int total = 0;
		for(int i = 0; i<8;i++) {
			total += monthArray[i];
		}
		total += 15;
			System.out.println("총일수 : "+total);
			
			
		//오름차순 정리 [0]과 [2]를 비교해서 왼쪽이 작으면 내버려두고, 크면 swich [0]부터 [5]까지 비교하고 [0]고정, [1]부터 [5]까지 비교하고 [1]고정	
			

			
			
			
		}
	}


