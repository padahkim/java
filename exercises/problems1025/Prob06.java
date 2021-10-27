package java1025.prob;
/*
 * ko, en, jp 평균을 구해서 60점 이상이면 "합격", 60점 미만이면 "불합격"을 
 * 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 1) 합격일때
 * 평균  65.0점, 합격입니다
 * 
 * 2)불합격일때
 * 평균  34.5점, 불합격입니다
 */

public class Prob06 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45;
		int jp = 22;
		int sum = ko + en + jp;
		int average = sum/3;
		String result = average>=60 ? "pass":"fail";
		System.out.println(result);
		
		
	}//end main()

}//end class





