package java1102_api;

public class Java128_Math {

	public static void main(String[] args) {
		//1에서 10까지의 난수
		int[] num = new int[10];
		
		//난수발생
		for(int i=0; i<num.length; i++) {
			num[i]	= (int)Math.floor(Math.random()*10)+1;
			
			//중복체크
			for(int j=0 ; j < i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		/*
		int nan = (int)Math.random()*10;
		System.out.println(nan);
	
		for(int i=0; i<num.length; i++) {
			num[i]	= nan;
		}
		*/
		for(int data : num) {
			System.out.println(data);
		}
	}

}
