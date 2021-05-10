package java_20210504;

public class CalenderDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일이고, 윤년은 366일 3. 윤년은 2ㅏ년마다 발생하고 그 중에서 100배수는
		 * 제외하고 400배수는 제외하지 않는다. 4. 20201년 4월 30일은 무슨요일 일까요? 힌트) 2020년까지 총 일수 3월까지 총일수
		 * 30을 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일
		 */
		int year = 2021;
		int month = 5;
		int day = 4;
		int totalCount = 0;

		/*
		 * int toatalCount = (year -1) * 365 + 31 + 28 + 31 + day; if (year % 4 == 0) {
		 * System.out.println(toatalCount + 1); if (year % 400 == 0) {
		 * System.out.println(toatalCount + 1); } else {
		 * System.out.println(toatalCount); } } else { System.out.println(toatalCount);
		 * }
		 * 
		 * if (toatalCount % 7 == 1) { System.out.println("월요일"); } else if (toatalCount
		 * % 7 == 2) { System.out.println("화요일"); } else if (toatalCount % 7 == 3) {
		 * System.out.println("수요일"); } else if (toatalCount % 7 == 4) {
		 * System.out.println("목요일"); } else if (toatalCount % 7 == 5) {
		 * System.out.println("금요일"); } else System.out.println("토요일");
		 */

		// 2020년까지 총 일수
		/*totalCount = 365 * (year - 1) + (year - 1) / 4 // 2020 년까지 윤년
				- (year - 1) / 100 // 2020년까지 100의 배수는 제외
				+ (year - 1) / 400; // 2020년까지 400의 배수는 추가*/
		totalCount = (year -1)*365 ;
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = (year%4==0 && year%100 !=0) || year % 400 ==0;
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		for(int i = 0; i<month-1;i++) {
		totalCount += monthArray[i];
	}

		// 2021년도 4월의 일수를 더한다.
		totalCount += day;

		int dayOfWeek = totalCount % 7;
		String message = "";
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
			
		
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다",
				 year, month, day, message);

	}

}
