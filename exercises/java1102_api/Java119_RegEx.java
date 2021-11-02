package java1102_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java119_RegEx {

	
	public static void main(String[] args) {
		String phone = "0016-253-5243";
		System.out.println(phone.matches("01(0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})"));
		
		                              //일부가 포함이 되면 되므로
		//Pattern pt = Pattern.compile("01(0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})");
		                            //이걸로시작                                                          //이걸로끝 까지 지정해줘야함
		Pattern pt = Pattern.compile("^01(0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})$");
		Matcher mt = pt.matcher(phone);
		while(mt.find())
		System.out.printf("%s\n", mt.group());
	}

}
