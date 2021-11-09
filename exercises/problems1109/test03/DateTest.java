package ncs.test03;

import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		
		//GregorianCalendar gc = new GregoricanCalendar(1987,4,27);
		//SimpleDateFormat fm = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		//System.out.println("생일:" +fm.format(gc.getTime()));
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		
		date1.set(1987, 5, 27);
		date2.set(2016, 4, 18);
		
		System.out.printf("생일: %d년 %d월 %d일 수요일\n",date1.get(Calendar.YEAR),
				date1.get(Calendar.MONTH), date1.get(Calendar.DATE));
		System.out.printf("현재: %d년 %d월 %d일 \n",date2.get(Calendar.YEAR),
				date2.get(Calendar.MONTH), date2.get(Calendar.DATE));
		System.out.printf("나이: %d 세", date2.get(Calendar.YEAR)-date1.get(Calendar.YEAR));
		//System.out.printf("현재 :",);
	}

}
