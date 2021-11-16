package java1116_api.prob;

import java.util.Calendar;

/*
 * [출력결과]
 * <4시부터 12시 미만일때>
 * 지금은 5시 35분입니다.
 * Good Morning
 * 
 * <12시부터 18시 미만일때>
 * 지금은 16시 49분입니다.
 * Good Afternoon
 * 
 * <18시부터 22시 미만일때>
 * 지금은 20시 30분입니다.
 * Good Evening
 * 
 *  <그외 일때>
 *  Good Night
 */


public class Prob003_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();//현재 날짜와 시간으로 세팅됨
		System.out.println(today.get(Calendar.YEAR));//올해가 몇년인지 알아냄
		System.out.println(today.getTime());//현재 실시간
		System.out.println(today.get(Calendar.HOUR));
		if(today.get(Calendar.HOUR)>=4 && today.get(Calendar.HOUR)<12) {
			System.out.println("Good Moring");
		} else if (today.get(Calendar.HOUR)<18 && today.get(Calendar.HOUR)>=12) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}
			
	}//end main()
}//end class
