package java1103_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요
 * [출력결과]
 * 2020년2월29 토요일
 */

public class Java143_Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = 2020;
		int month = 2;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		//2020년 2월의 마지막
		int date = cal.getActualMaximum(Calendar.DATE);
		
		cal.set(Calendar.DATE, date);
		
		System.out.println(date);
		
		//2020년 2월 마지막일의 요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		String week="";
		switch(day) {
		case 1: week="일";break;
		case 2: week="월";break;
		case 3: week="화";break;
		case 4: week="수";break;
		case 5: week="목";break;
		case 6: week="금";break;
		case 7: week="토";break;
		}
		System.out.printf("%d-%d-%d %s요일\n", year, month, day);
		/*
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		System.out.printf("%d년%d월%d %d요일",year,month,date,cal.get(Calendar.DAY_OF_WEEK));
		*/
	}//main()

}//end class
