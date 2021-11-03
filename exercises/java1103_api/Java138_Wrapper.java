package java1103_api;


/*
 * sn 변수에 저장된 문자열중에서 숫자 갯수를 출력
 * 출력결과
 * 숫자갯수:3 
 */



public class Java138_Wrapper {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		for (int i=0; i<sn.length(); i++) {
			char data = sn.charAt(i);
			if(Character.isDigit(data))
				cnt++;
		}
			
		System.out.println(cnt);
		
		
	}//end main()

}//end clas
