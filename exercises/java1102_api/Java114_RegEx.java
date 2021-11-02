package java1102_api;

import java.util.regex.Pattern;

public class Java114_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String sb = "bsba5e";
		String st = "aerwefgcc";
		
		//a-zA-Z_*$가 sn변수에 포함되어 있으면 true 아니면 false 리털
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));
		
		//0-9가 포함되어 있으면 true 아니면 false리턴
		System.out.println(sn.matches(".*[0-9].*"));
		
		//2로 시작하면 true, 아니면 false 리턴
		System.out.println(sn.matches("2.*"));
		
		//2로 시작하고 5로 끝나면 true아니면 false리턴
		System.out.println(sn.matches("2.*5"));
		//ab로 시작하고 임의문자 5개가 오면 true 아니면 false
		System.out.println(sb.matches("[ab].{5}"));
		//'a'나 'b'로 시작하고 'cc'로 끝나며 사이에는 1개에서 5개의 문자가 오면 true 아니면 false
		System.out.println(sb.matches("[ab].{1,5}cc"));
		//'a'나 'b'로 시작하고 'cc'로 끝나며 사이에는 1개에서 5개의 이상의 문자가 오면 true 아니면 false
		System.out.println(sb.matches("[ab].{5,}cc"));
		
		//System.out.println(sb.matches("[ab].{,5}cc")); 이거 왜 에러였지?ㅎ
		
		/*
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
		 *          있는지를 확인한다.
		 * Pattern.comile(): 여러개의 텍스트를 재사용 가능한 Pattern 
		 *          인스턴스로 컴파일 한다.
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 find 
		 * start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환
		 * end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 */
		String input1 = "11mar123dd";
		String input2 = "maaaa";
		String input3 = "252352";
		
		//\w:영문,숫자
		System.out.println(input1.matches("[\\w]{5,10}"));
		System.out.println(Pattern.compile("[\\d]").matcher(input1).find());
		System.out.println(Pattern.compile("[\\d]").matcher(input2).find());
		System.out.println(Pattern.compile("[\\d]").matcher(input3).find());
		
		System.out.println(Pattern.compile("[a-zA-z]").matcher(input1).find());
		System.out.println(Pattern.compile("[a-zA-z]").matcher(input2).find());
		System.out.println(Pattern.compile("[a-zA-z]").matcher(input3).find());
		//영문자나 숫자 암거나 들어와도 ㅇㅋ
		System.out.println(input1.matches("[\\w]{5,10}"));
		
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find());
		
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input2).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input2).find());
		
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input3).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input3).find());
	}

}
