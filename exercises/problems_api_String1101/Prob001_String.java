package Java1101_api.prob;

/*
 1 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로 변환하여
 리턴하는 initcap() 메서드를 구현하시오. 
 2 예를 들어 "hello world java" 는 "Hello World Java"로 변환됩니다. 
 3 출력결과
 Hello World Java
 Java Programming
 */
public class Prob001_String {

	public static void main(String[] args) {
		System.out.println(initcap("hello world java"));
		System.out.println(initcap("java programming"));
	}// end main()

	private static String initcap(String str) {
		// 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로
		String[] words = str.split(" ");
		String result = "";
		
		for (int i=0 ; i<words.length ; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase()+words[i].substring(1);
			result = result + words[i]+" ";
		}
		
		/*
		String first = words[0].substring(0, 1).toUpperCase()+words[0].substring(1);
		String second = words[1].substring(0, 1).toUpperCase()+words[1].substring(1);
		String third = words[2].substring(0, 1).toUpperCase()+words[2].substring(1);
		*/
		
		/*
		System.out.println(words[0].substring(0, 1).toUpperCase()+words[0].substring(1));
		System.out.println(words[1].substring(0, 1).toUpperCase()+words[1].substring(1));
		System.out.println(words[2].substring(0, 1).toUpperCase()+words[2].substring(1));
		*/
		
		/*
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i].substring(0, 1).toUpperCase());
			System.out.println(words[i].substring(1));
		}
		*/
	    	
		return result;
	}
}
	
	
	// end initcap()
// end class
/*
String[] arr = str.split(" ");

for(String data: arr) {
	data;
}
*/
/*
String data = "";
String[] arr= str.split(" ");


for (int i=0;i<arr.length;i++) {
	 
}
*/
/*for (String data: arr) {
	System.out.println(data);
}*/