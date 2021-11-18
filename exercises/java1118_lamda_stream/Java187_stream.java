package java1117_lamda_stream;

import java.util.Optional;

public class Java187_stream {

	public static void main(String[] args) {
		//int[] arr = null;  nullpointer exception
		//int[] arr = {}; ok
		int[] arr = new int[0];
		
		System.out.println("arr.length="+arr.length);
		
		//Optional<String> opt = null;
		Optional<String> opt = Optional.empty();
		System.out.println("opt="+opt);
		//System.out.println("opt="+opt.get()); No value Exception
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			str = "";//예외가 발생하면 빈문자열로 초기화
//		}//예외처리 필요
		
		str = opt.orElse("EMPTY");//Optional에 저장된 값이 null 이면 ""반환
		System.out.println("str"+str);
	}

}
