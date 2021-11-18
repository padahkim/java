package java1117_lamda_stream;

import java.io.*;
import java.util.stream.Stream;

public class Java185_stream {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
				};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map으로 Stream<File>을 Stream<String> 으로 변환     //밑의 메서드 참조(f)->f.getName//file객체를 주면  getName으로 이름을 뽑아내는것
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); //모든 파일의 이름을 출력//최종연산이므로 스트림 닫힘
		
		fileStream = Stream.of(fileArr);//스트림을 다시 생성
		
		fileStream.map(File::getName)
			.filter(s -> s.indexOf('.')!=-1)//확장자가 없는것은 제외
			.peek(s->System.out.printf("filename=%s%n", s))
			.map(s -> s.substring(s.indexOf('.')+1))//확장자만 추출
			.peek(s->System.out.printf("extension=%s%n", s))
			.map(String::toUpperCase)//모두 대문자로 변환
			.distinct() //중복제거
			.forEach(System.out::println);
	}

}
