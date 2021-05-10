package java_20210503;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1; // 초기값
		while (i <= 10) { // 조건
			sum += i;
			i++; // 증감
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);

		// whlie을 for와 똑같이 바꾸면(멍청한 코드)
		sum = 0;
		int j = 1;
		for (; j <= 10;) {
			sum += j;
			j++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		//99단을 whlie을 두번 돌려서 짜보기
		
		
		int first = 2;
		while (first < 10) {
			System.out.printf("%d단입니다.", first);
			//위치가 중요!!!!!!
			int second = 1;
			while(second <10) {
				
				System.out.printf("%d*%d = %d %n", first, second, first * second);
				second++;
			}
			first ++;
			}			
		}
	}


