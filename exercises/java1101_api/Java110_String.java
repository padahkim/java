package Java1101_api;

public class Java110_String {

	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));
	}

	public static char[] process(char arr[]) {//char[] arr 이거라고 보면 됌
		//'_'를 ' '으로 변환 후 리턴하는 프로그램을 구현하시오.
		for(int i=0;i<arr.length;i++)
			if(arr[i]=='_')
				arr[i]=' ';
		return arr;
	}
}
