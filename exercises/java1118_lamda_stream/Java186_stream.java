package java1117_lamda_stream;

import java.util.*;
import java.util.stream.Stream;

public class Java186_stream {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
				);
														//stream is static method: (arr)->Arrays.stream(arr);
		//Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm
		//.map(String::toLowerCase)
		.distinct()
		//.sorted()
		.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line->Stream.of(line.split(" +")))
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}

}
