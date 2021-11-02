package java1102_api;

import  java.util.Random;


public class Java130_Random {

	public static void main(String[] args) {
		int[]num = new int[10];
		
		Random ran = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = ran.nextInt(10)+1;
			
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int data : num)
			System.out.println(data);
	}

}
