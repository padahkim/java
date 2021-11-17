package java1117_lamda_stream;

import java.util.function.*;

public class Java180_lamda {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s,16);   //여기의 Integer 가 ///16진수로 해석해서 숫자로 바꿔라 "FF"->255
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i); //여기의 Integer로 들어감 , 합친 함수의 리턴값은 String이됨///이진수 문자열로 바꿔라
	
		Function <String, String> h = f.andThen(g);//f 함수 적용한 뒤에 g함수를 적용하라
		Function <Integer, Integer> h2 = f.compose(g);// == g.andThen(f)
		
		System.out.println(h.apply("FF")); // "FF" -> 255 -> "1111111"
		System.out.println(h2.apply(2)); // 2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x; //항등 함수(identity function)
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 100;
		Predicate<Integer> notP = p.negate(); // i >= 100;
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));//true
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);//==str1.equals(str2)
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}
