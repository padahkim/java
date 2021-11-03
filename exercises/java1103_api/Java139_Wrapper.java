package java1103_api;

import java.util.Scanner;

/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.
 * 입력 : 홍길동,80,93
 * 
 * [출력결과]
 * 이름: 홍길동
 * 국어: 80
 * 영어: 93
 * 평균: 86.5 (double로 계산)
 */

public class Java139_Wrapper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		
		String line = sc.next();
		String[] data = line.split(",");
		double sum = 0.0;
			for(int i=1; i<data.length; i++) {
				sum += Double.parseDouble(data[i]);
			}
		//Double.parseDouble(data[1]) + Double.parseDouble(data[2])//data[1]+data[2];
		
		
		System.out.println("이름:"+data[0]);
		System.out.println("국어:"+data[1]);
		System.out.println("영우:"+data[2]);
		System.out.println("평균:"+sum/2);
		
		
		sc.close();
		
		/* 한줄에 , , 이렇게 입력이므로 걍 넥스트로하든 넥스트라인하든 같은결과 받아도댐
		String name = sc.next();
		int score = sc.nextInt();
		int average = (score+score)/2;
		
		System.out.printf("이름: %s", name);
		System.out.printf("국어: %d", score);
		System.out.printf("영어: %d", score);
		System.out.printf("평균: %d", average);
		*/
		
		//콤마 안넣었을때 다시 하게끔도 해보시오
		/*while(true) {
			System.out.print("입력");
			
			String line = sc.next();
			if(!line.contains(","))
			
			마지막에  break
			*/
		}
	}

}
