package java1103_api;

import java.util.Calendar;

abstract class Test{
	public static Test getInstance() {
		return new TestExam();
	}
	abstract void display();
}

class TestExam extends Test{
	public TestExam() {
		
	}
	@Override
	void display() {
		System.out.println("display");
	}
}


/*
class TestExam extends Test{
	public static Test getInstance() {
		return new TestExam();
		//Test tt = new TestExam을 해준거임
	}
}
*/
public class Java142_Calender {

	public static void main(String[] args) {
		Test tt = Test.getInstance();
		//tt.display();
		//tt.prn
		Test te = Test.getInstance();
		
		Calendar cal = Calendar.getInstance();
		//Calendar caa = Calendar.getInstance();
		//System.out.println(cal==caa);
		
		int year = cal.get(Calendar.YEAR);
		//MONTH는 1월일때 0으로 리턴한다.
		int month = cal.get(Calendar.MONTH) + 1;
		
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);
		
		//이번달의 마지막 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		//오늘의 요일 리턴(일요일 =1 월요일=2......)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//어제날짜로 세팅
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.get(Calendar.DATE));
		
		//2021 11월 18일 수능날 세팅- 컴터 ㅄ의 월은 0월부터 시작이라
		cal.set(2021, 10, 18);
		//오늘
		Calendar cde = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cde.get(Calendar.DATE));
		
		System.out.println(cde.toString());
	}
}
