package ncs.test06;

import java.util.*;

public class ExceptionTest {

	public static void main(String[] args) {
		int inputData;
		
		Caculator caculator = new Caculator();
		Scanner sc = new Scanner(System.in);
		
		inputData = sc.nextInt();	
		
		try {
			System.out.println(caculator.getSum(inputData));
		} catch(InvalidException e) {
			e.printStackTrace();
			System.out.println("Error message:"+e.getMessage());
		}
		
		
	}

}


