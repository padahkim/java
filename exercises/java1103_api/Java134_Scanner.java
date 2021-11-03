package java1103_api;

import java.util.Scanner;

public class Java134_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("단입력");
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan , i, dan*i);
		}
		System.out.print("계속하시오?(종료:n, 계속:아무키나) ");
		char chk = sc.next().charAt(0);
		if(chk=='n') {
			System.out.println("프로그램종료");
			break;
			}
		}
		//sc.close();
	}//end main

}//end class
