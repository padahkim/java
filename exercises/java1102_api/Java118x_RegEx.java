package java1102_api;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Java118x_RegEx {

	public static void main(String[] args) {
		String str = "The Best things in best life are best free";
		
		//boolean res = Pattern.compile("best").matcher(str).find();
		//System.out.println()
		
		
		boolean res = Pattern.compile("best").matcher(str).find();
		
		System.out.println(res);
		Pattern pt = Pattern.compile("best",4);
		Matcher mh = pt.matcher(str);
		int i = 1;
		while(mh.find()) {
			System.out.printf("%d번째 %d~%d\n", i++,  mh.start(), mh.end(), mh.group());
		}
			System.out.println("===============================");
			str = "The Best things in best life are best free";
			
			pt = Pattern.compile("(best)(10|20|30)",Pattern.CASE_INSENSITIVE);
			mh = pt.matcher(str);
			i = 1;
			while(mh.find()) {
				System.out.printf("%d번째 %d~%d %s %s\n", i++,  mh.start(), mh.end(), mh.group(1),mh.group(2));
			}
		}
		//여기서 추가로 모든 best가 포함되게 하기
		
	}


