package java1102_api;

import java.util.StringTokenizer;

public class Java124_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("java,,jsp/spring", ",/");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens())
			System.out.println(str.nextToken());
		
		System.out.println("=========================");//,,위에서는 구분못함 밑에선 빈칸으로 인식
		String[] data = "java,,jsp/spring".split("[,/]");
		System.out.println(data.length);
		for(int i=0; i<data.length;i++)
			System.out.printf("data[%d]=%s\n",i ,data[i]);
	}

}
