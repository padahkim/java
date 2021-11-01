package Java1101_api;
/*
 * [출력결과]
 * aerok
 * korea
 */
public class Java108_String {

	public static void main(String[] args) {
		String sn = "korea";
		char [] data = display(sn);
		System.out.println(data);
		System.out.println(sn);
	}//end main()
	
	public static char[] display(String alpa) {
		//alpa 매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램을 구현
		
		//배열크기:length 키워드, 문자열크기:length()메소드
		char[] arr = new char[alpa.length()];
		for(int i=0;i<arr.length;i++)
			arr[i]=alpa.charAt(arr.length-1-i);
					
			//arr[i]=alpa[arr.length-1-i];배열일때 이렇게 하는게 스트링이니까 이렇게 하면 에러남
			//arr[0]=alpa[4]; //alpa[arr.length-1-i]
			//arr[1]=alpa[3];	//alpa[arr.length-2-i]
			//arr[2]=alpa[2]; //alpa[arr.length-3-i]
			//arr[3]=alpa[1]; //alpa[arr.length-4-i]
			//arr[4]=alpa[0]; //alpa[arr.length-5-i]
			
		/*
		char[] data;
		for(int i = alpa.length(); i > 0; i--) {
			data[i]=alpa.;
		}
		
		return data;
		*/
		return arr;
	}
}
