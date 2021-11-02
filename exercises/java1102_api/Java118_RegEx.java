package java1102_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java118_RegEx {

	public static void main(String[] args) {
		String str = "The BEst things in best life are best free";
		
		//boolean res = Pattern.compile("best").matcher(str).find();
		//System.out.println(res);
		
		System.out.println("===============================");
		//Pattern pt = Pattern.compile("best");
		Pattern pt = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mh = pt.matcher(str);
		int i = 1;
		while(mh.find()) {
			System.out.printf("%d번째 %d~%d %s \n", i++, mh.start(), mh.end(), mh.group());
		}
		
		System.out.println("===============================");
		str = "The BEst10 things in best20 life are best30 free";
		
		pt = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);
		mh = pt.matcher(str);
		i = 1;
		while(mh.find()) {
			 //mh.group()와 mh.group(0) 같은 의미.
			System.out.printf("%d번째 %d~%d %s %s %s %s\n", 
					i++, mh.start(), mh.end(), mh.group(), mh.group(1), mh.group(2), mh.group(0) );
		}
	}//end main()
}//end class
