package java1102_api;

public class Java122_StringBuffer {

	public static void main(String[] args) {
		char[] arr;
		StringBuffer sb = new StringBuffer("java test");
		
		//StringBuffer->String
		String sn = sb.toString();
		
		//String->char[]
		char[] data = sn.toCharArray();
		display(data);
		//sb.toString().append(arr);
		//display(sb);
	}
	
	public static void display(char[] data) {
		for(char cn:data)
			System.out.println(cn);
	}
}
