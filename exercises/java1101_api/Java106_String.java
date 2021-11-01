package Java1101_api;

public class Java106_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java한1");
		System.out.println("문자열 크기:" + str.length());
		System.out.println("대문자:" + str.toUpperCase());
		System.out.println("소문자:" + str.toLowerCase());
		System.out.println("문자" + str.charAt(1));
		//스트링에 들어 있는 이 인덱스를 찾음
		System.out.println("인덱스" + str.indexOf('a'));
		System.out.println("인덱스" + str.indexOf(97));
		System.out.println("인덱스" + str.lastIndexOf('v'));
		System.out.println("인덱스" + str.lastIndexOf('a'));
		//5인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위" + str.substring(5));
		//2인덱스부터 8인덱스 미만 문자열 리턴
		System.out.println("범위" + str.substring(2, 8));//2부터 8미만
		
		//메모리에 저장된 문자열을 "여기 기호로"로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
			for(int i = 0; i<arr.length; i++)
				System.out.printf("arr[%d]=%s\n", i, arr[i]);
		
		int x = 10;
		int y = 20;
		System.out.printf("x=%d y=%d x+y=%d\n", x, y, x+y);
		//int -> String
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1=%s s2=%s s1+s2=%s\n", s1,s2,s1+s2);
		
		//char[] => String 형변환 하는 메서디 valueOf
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.printf(s3);
		
	}

}
