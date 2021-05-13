package java_20210507;

public class Calender {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int MONDAY = 1;
	public static final int THUSDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THIRTHDAY = 4;
	public static final int FIRYDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;

	private boolean isLeafYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;
	}

	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);

		int dayOfWeek = totalCount % 7;
		String message = "";
		if (dayOfWeek == Calender.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calender.THUSDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calender.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calender.THIRTHDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calender.FIRYDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calender.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calender.SUNDAY) {
			message = "일요일";

		}
		System.out.printf("%d년 %d월 %d일 %s 입니다", year, month, day, message);

	}

	public void print(int year, int month) {
		System.out.println(year + "년 " + month + "월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		

		// 탭만큼 띄어쓰기 해야한다. 예)2021-5달력을 출력하기 위해서는 2021년 5 월 1일까지 총 날짜를 구해서 7로 나눈 나머지만큼
		// 띄어쓰기하면 된다.

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7; // 예) 2021-05-01 토요일 = 나머지가 6

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i < monthArray[month - 1]; i++) {
			System.out.print(i + "\t");
			if (rest % 7 == 6)
				System.out.println();
			rest++;
		}
		System.out.println();
	}

	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}
}
