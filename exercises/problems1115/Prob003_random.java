package java1115_api.prob;

/*[문제]
 * 2~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 배열에서 소수를 구하여 출력하는 primeNumber() 메서드를 각각 구현하시오.
 * [출력결과]
<< 발생된 난수 >>
*  15 7  4  4  8  7  2  11  17  5 
<< 소수 숫자 >>
*  7 7 2 11 17 5
*  */
import java.util.*;

public class Prob003_random {

	public static void main(String[] args) {
		int[] array = makeArray();
		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n<< 소수 숫자 >>");
		primeNumber(array);
	}// end main( )

	private static int[] makeArray() {
		// 난수값를 발생시킨후 반환하는 프로그램을 구현하시오.
		int [] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Random().nextInt(21);
		}
		return arr;
	}// end makeArray()

	public static void primeNumber(int[] array) {
		
		ArrayList<Integer> list = new ArrayList();
		
		
			for(int i=0;i<array.length;i++) {
				int count = 0;
			if (array[i]<2)
				break;
			
			else if(array[i]==2)
				list.add(array[i]);
			
			else {
				for (int j=2;j<array[i]-1;j++) {
					if(array[i]%j==0) 
						count++;
				} if (count==0) {
					list.add(array[i]);
				} 
			}
			count = 0;
		}
			
		System.out.println(list);
		
		// array배열에서 소수만 출력하는 프로그램을 구현하시오.
		//2 3 5 7 11 13 17 19 
		//
		
		//경우를 나누자. 2보다 작으면 소수가 아님 2이면 소수 2보다 클경우에는 %0이 나오면 소수가 아님.
		
		//소수만을 구하는 메서드를 따로 빼서 구현한뒤에 반복문을 돌리는것이 더 나을듯...
		
		/*
		*/
		//System.out.println(list);
		}// end primeNumber()

}// end class
