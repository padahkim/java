package java1102_api;

public class Java121_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		//4인덱스에 ",jsp"문자열을 삽입
		sb.insert(4, ",jsp");
		
		//4인덱스부터 8인덱스 미만 사이의 문자열 삭제
		sb.delete(4, 8);
		
		//0인덱스의 문자 삭제
		sb.deleteCharAt(0);
		
		System.out.println(sb.toString());
		
		//문자열을 반대로 변경해서 리턴
		sb.reverse();
		
		System.out.println(sb.toString());
		
		String data = "mybasits orm";
		
		//String -> StringBuffer
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		
		//StringBuffer -> String
		String sng = sf.substring(0);
		System.out.println(sng);
		//StringBuffer -> String
		sng = sf.toString();
		System.out.println(sng);
		
		//StringBuffer -> String
		String srn = new String(sf);
		System.out.println(srn);
		
		System.out.println("===================");
		char[] arr = new char[] {'k','o','r','e','a'};
		
		//arr->StringBuffer
		StringBuffer sbf = new StringBuffer();
		sbf.append(arr);//append 의 리턴타입이 stringbuffer
		System.out.println(sbf);
		
		sbf.reverse();
		System.out.println(sbf);
		
		sbf = new StringBuffer();
		sbf.append(arr).reverse();
		System.out.println(sbf);
		
		System.out.println(new StringBuffer().append(arr).reverse());
		
		sbf = new StringBuffer();
		
	}

}
