package Java1101_api;

/*
 * 문자열관련클래스
 */

class StringTest extends Object {
	private char[] arr;
	
	public StringTest() {
		
	}
	public StringTest(char[] arr) {
		this.arr = arr;
	}
	public int length() {
		return arr.length;
	}
	
	public char charAt(int index) {
		return arr[index];
	}
	public boolean isUpperCase(int index) {
		if(arr[index] >= 'A' && arr[index] <='Z')
			return true;
		else
			return false;
	}
	public String toString() {
		String sn = "";
			for(char data : arr)
				sn += data;
		return sn;
	}
}



public class Java104_String {

	public static void main(String[] args) {
		StringTest st = new StringTest(new char[] {'j','a','v','Z'});
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.charAt(2));
		System.out.println(st.isUpperCase(2));
		System.out.println(st.isUpperCase(3));
		System.out.println(st.toString());
	}

}
