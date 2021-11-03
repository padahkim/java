package java1103_api;

import java.text.SimpleDateFormat;

public class Java140_System {

	public static void main(String[] args) {
		//currentTimeMillis() : 1970.1.1부터 초단위로 누적한 값을 밀리세컨드로 리턴
		//하루 86400초. 1초는 1000밀리세컨드
		long curr = System.currentTimeMillis();
		
		System.out.println(curr);
		
		
		
		
		
		//SimpleDateFormat: 날짜, 시간 형식의 패턴을 제공해주는 클래스이다.
		//MM:월, mm:분
		//hh:12시간,HH:24시간
		                             //HH 하면 24시간기준으로 나옴
		String pattern = "yyyy-MM--dd hh:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(curr);
		System.out.println(date);
	}

}
