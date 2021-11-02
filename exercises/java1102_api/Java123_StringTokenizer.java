package java1102_api;

import java.util.StringTokenizer;

public class Java123_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer("문자열","구분자");
			//구분자가 공백이면 두번째 인자를 생략할 수 있다.
		
		StringTokenizer st = new StringTokenizer("java,jsp",",");
		System.out.println(st.countTokens());
		
		//메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		//next토큰같은경우 값을 가져온 다음에 기존의 메모리의 값은 완전히 삭제됌//복사 하는거 아님// 모든 메서드api쓸때 이런거 확인 중요
	}

}
