package java1103_api;
/*
 * 1 기본자료형을 클래스로 정의해놓은 것을 Wrapper라한다.
 *   char -> Character
 *   byte	-> Byte
 *   short	-> Short
 *   int	-> Integer
 *   long	-> Long
 *   float	-> Float
 *   double	-> Double
 *   boolean -> Boolean
 *
 * 2 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
 *   Wrapper클래스를 제공한다.
 * 
 * 3 auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 *   auto boxing => 스택 -> 힙영역에 복사
 *   auto unboxing => 힙 -> 스택영역에 복사
 */

public class Java135_Wrapper {

	public static void main(String[] args) {
		
		String data = "1234";
		
		//String -> Integer
		Integer it = new Integer(data);
		
		//Integer -> int
		int num = it.intValue();
		
		System.out.println("num=" + num);
		
		int num2 = it;//auto unboxing
		System.out.println("num2=" + num2);
		
		long nn = it.longValue();
		System.out.println("nn="+nn);
		
		Double db = new Double(data);
		int dnum = db.intValue();
		System.out.println("dnum=" + dnum);
		long dnn = db.longValue();
		System.out.println("dnn=" + dnn);
		
		//String -> int
		int num1 = Integer.parseInt(data);
		System.out.println("num1=" + num1);
		
		double num3 = Double.parseDouble(data);
		System.out.println("num3=" + num3);
		
		int x = 10;
		Integer ig = new Integer(x); //boxing
		Integer ie = x; //auto boxing
		
		int y = ie.intValue();//unboxing
		int k = ie; // auto unboxing
		System.out.printf("y=%d k=%d\n", y, k);
		
		
	}

}
