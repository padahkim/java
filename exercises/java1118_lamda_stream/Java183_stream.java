package java1117_lamda_stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java183_stream {

	public static void main(String[] args) {
		/*
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); //list를 stream으로 변환
		intStream.forEach((i)->System.out.print(i));//for each 최종연산
		
		
		//stream은 1회용 최종 연산을 수행하면 닫힌다
		intStream = list.stream(); //list로부터 스트림 재생성
		intStream.forEach(System.out::print);
		*/
		
		
		String[] strArr = {"a","b","c"};
		//Stream<String> strStream = Stream.of(new String[] {"a","b","c","d"});
		//Stream<String> strStream = Stream.of("a","b","c");
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		//intStream.forEach(System.out::println);
		//System.out.println(intStream.count());
		//System.out.println(intStream.sum());
		System.out.println(intStream.average());// intStream의 경우 다양한 메서드 사용 가능
	
		Integer[] intArr2 = {5,6,7,8,9};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
		//intStream2.forEach(System.out::println);
		System.out.println(intStream2.count());// integer의 스트림은  Count밖에 없음
		
		
		IntStream intStream3 = new Random().ints();//무한스트림
		
		intStream3
		.limit(5)//이거 없으면 무한대로 나옴
		.forEach(System.out::println);
		
		IntStream intStream4 = new Random().ints(10,20,30);//10개 20에서 30범위
		
		intStream4
		.forEach(System.out::println);
		
		// iterate(T seed, UnaryOperator f) 단항연산자, 하나 넣으면 하나나옴
		Stream<Integer> intStream5 = Stream.iterate(1,n->n+2);
		intStream5.limit(10).forEach(System.out::println);
		
		
		//generate(Supplier s): 주기만 하는것 입력x, 출력O
		Stream<Integer> onetStream = Stream.generate(()->1);
		onetStream.limit(10).forEach(System.out::println);
	}

}
