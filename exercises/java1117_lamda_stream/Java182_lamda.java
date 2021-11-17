package java1117_lamda_stream;

import java.util.function.Function;
import java.util.function.Supplier;

public class Java182_lamda {
	public static void main(String[] args) {
		Function <String,Integer> f = (String s) -> Integer.parseInt(s);
		System.out.println(f.apply("100")+200);
		
		Function <String,Integer> ff = Integer::parseInt; //메서드 참조
		System.out.println(ff.apply("100")+200);
		
		//Supplier 는 입력 x 출력o
		//Supplier<MyClass> s = ()-> new MyClass();
		Supplier<MyClass> s = MyClass::new;
		
		
		MyClass mc = s.get();
		System.out.println(s.get());
		System.out.println(mc);
		
		//Function<Integer, int[]> f2 = (i)->new int[i];
		Function<Integer, int[]> f2 = int[]::new;//메서드참조
		
		int[] arr = f2.apply(100);
		System.out.println(arr.length);
	}

	
}

class MyClass{}