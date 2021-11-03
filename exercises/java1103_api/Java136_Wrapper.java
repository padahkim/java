package java1103_api;

public class Java136_Wrapper {

	public static void main(String[] args) {
		int x = 10;
		double y = 5.8;
		char[] data = {'a','b','c'};
		
		//기본데이터 ->String
		String a = String.valueOf(x);
		String b = String.valueOf(y);
		String c = String.valueOf(data);
		System.out.printf("%s %s %s\n", a, b, c);
		
		//String -> 기본데이터
		x = Integer.parseInt(a);
		y = Double.parseDouble(b);
		System.out.printf("%d %.1f\n",x ,y);
		}
	}


