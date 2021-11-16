package java1116_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		
		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int countUpperCase = 0;
		int countLowerCase = 0;
		int countInt = 0;
		
		for(char charArr: arr) {
			if(Character.isUpperCase(charArr))
				countUpperCase++;
			else if(Character.isLowerCase(charArr))
				countLowerCase++;
			else
				countInt++;
		}
		System.out.println("영어 소문자 갯수"+countUpperCase);
		System.out.println("영어 대문자 갯수"+countLowerCase);
		System.out.println("숫자 갯수"+countInt);
		
	}// end display()

}// end class
