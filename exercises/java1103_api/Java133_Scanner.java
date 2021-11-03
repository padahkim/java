package java1103_api;

import java.util.Scanner;

public class Java133_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("부서:");
		//String dept = sc.next();
		String dept = sc.nextLine();
		
		//System.out.println("연봉");
		int salary = sc.nextInt();
		
		//System.out.print("평가:");
		double avg = sc.nextDouble();
		
		System.out.printf("%s %d %.1f\n", dept, salary, avg);
		
		sc.close();//연결종료
		
	}

}
