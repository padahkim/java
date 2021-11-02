package java1102_api;
/*
 * 정규식(Regular Expression)
 * 1 정규식이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 *    찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
 *    작성한 문자열을 말한다.
 *    
 */



public class Java113_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		String st = "java             korea";
		
		
		
		System.out.println(sn);
		System.out.println(sg);
		
		//[]대괄호는 or을 의미한다.
		//sn 변수에 저장된 문자열에서 a이거나 r 이면 "_"로 변경한다.
		 System.out.println(sn.replaceAll("[ar]","_"));
		 System.out.println(sn);
		 //sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true, 아니면 false를 리턴
		 System.out.println(sn.matches(".*[ar].*"));
		
		 //sn변수에 저장된 문자열에서 a이거나 r이 시작되면 true, 아니면 false를 리턴
		 System.out.println(sn.matches("[ar].*"));
		 
		 System.out.println(st.replaceAll("\\s{2,3]","@"));
		
	}

}
