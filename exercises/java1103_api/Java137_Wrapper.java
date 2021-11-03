package java1103_api;

public class Java137_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		if(data >= 'a' && data <= 'z')
			System.out.println("소문자");
		
		//대문자이냐?
		System.out.println(Character.isUpperCase(data));
		System.out.println(Character.toUpperCase(data));
		
		//소문자
		System.out.println(Character.isLowerCase(data));
		System.out.println(Character.toLowerCase(data));
		
		//숫자
		System.out.println(Character.isDigit(data));
		
		
		//알파벳
		System.out.println(Character.isAlphabetic(data));
		
		//문자
		System.out.println(Character.isLetter(data));
	}

}
