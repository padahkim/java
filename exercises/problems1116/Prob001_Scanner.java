package java1116_api.prob;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
/*
	1부터 100까지 숫자를 입력하세요:50
	1과 100사이의 값 중 입력한 값보다 큰 값을 입력하세요.
	1부터 100까지 숫자를 입력하세요:90
	1과 100사이의 값 중 입력한 값보다 작은 값을 입력하세요.
	1부터 100까지 숫자를 입력하세요:85
	1과 100사이의 값 중 입력한 값보다 큰 값을 입력하세요.
	1부터 100까지 숫자를 입력하세요:88
	사용자가 입력한 값과 컴퓨터가 발생시킨 임의의 값이 일치합니다.
	총 실행 횟수는 4번 입니다.
 */



public class Prob001_Scanner {
	public static void main(String[] args) {
		//System.out.println(Math.random()*99);
		
		Scanner key = new Scanner(System.in);
		int randomNum = (int)(Math.random()*99+1);
	
		/* randomNum에 1부터 100까지의 숫자 중 컴퓨터가 임의로 발생시킨 값이 저장되도록 작성합니다.*/
		 //컴퓨터가 임의로 발생시키는 값을 저장할 변수
		int userNum = 0; //사용자가 입력할 값을 저장할 변수
		int count = 0;//실행횟수를 저장할 변수
		//randomNum과 userNum이 일치할때 까지 반복하여 입력받아 평가하는 코드를 작성하세요.
		
		while(true) {
			try {
			userNum = key.nextInt();
			} catch(Exception e) {
				key = new Scanner(System.in);//스캐너 객체를 다시 초기화 안시켜줄 시 무한루프를 돔
				System.out.println("입력을 똑바로 하시오");
				e.printStackTrace();
				e.getClass().getName();
				e.getMessage();
				System.out.println(e.getClass().getName()+"예외가"+e.getMessage()+"때문에발생");
				
			}
			System.out.printf("%d==%d,count=%d\n",randomNum,userNum,count);
			count++;
			if(randomNum==userNum)
				System.out.println("정답 you tried"+count+"times");
		}
		
		
	}//end main()

}//end class










