package java1102_api;

import java.util.Random;

public class Java129_Random {

	public static void main(String[] args) {
		Random ran = new Random();
		double r1 = ran.nextDouble();
		System.out.println(r1);
		
		int r2 = ran.nextInt();
		System.out.println(r2);
		//0부터~10미만
		int r3 = ran.nextInt(10);
		System.out.println(r3);
		//0부터~10까지
		System.out.println(r3+1);
	}

}
