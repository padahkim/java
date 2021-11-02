package java1102_api;

/*
 * java.lang.String 불변/메모리에 한번 생성되면 메모리에 생성한 스트링을 못바꿈
 * java.lang.StringBuffer : 가변, 비동기화 //메모리에 저장한 문자열을 변경
 * java.lang.StringBuilder: 가변, 동기화
 */




public class Java120_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test");
		String ss = sg.replace("java", "jsp");
		System.out.println("ss:"+ ss);
		System.out.println("ss:"+ sg);
		
		System.out.println("==============================");
		StringBuffer sb = new StringBuffer("spring test");
		sb.replace(0, 6, "framwork");
		System.out.println("sb:" +sb);

	}

}
