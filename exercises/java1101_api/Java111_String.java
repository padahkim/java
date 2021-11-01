package Java1101_api;

public class Java111_String {

	public static void main(String[] args) {
		System.out.print("35276은");
		prnDisplay(numCheck("35276"));
		
		System.out.print("2_8a은");
		prnDisplay(numCheck("2_8a"));
	}
	
	public static boolean numCheck(String data) {
		//data값이 숫자면 true 아니면 false를 반환하는 로직 구현
		for(int i = 0; i<data.length(); i++) {
			if(!(data.charAt(i) >='0' && data.charAt(i)<='9'))
				return false;
		}
		return true;
		
		/*for(int i = 0; i<data.length(); i++) {
			if(!(data.charAt(i) >='0' && data.charAt(i)<='9')
				return true;
			else
				return false;
		}//트루팔스 무한몇번이ㅏㄴ 반복되므로 이로직은 x
		return false;*/
	}
	
	public static void prnDisplay(boolean chk) {
		//chk true이면 "숫자입니다"
		//chk false이면 "문자입니다"로 출력
		if(chk)
			System.out.println("숫자입니다");
		else
			System.out.println("문자입니다");
	}
}
