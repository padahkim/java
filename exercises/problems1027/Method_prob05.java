package java1027_method.prob;

/*
 * <<프로그램 실행결과 >>
 * 2 or 5의 배수가 아닌 갯수 : 7
 * 2 or 5의 배수가 아닌 합계 : 107
 */
public class Method_prob05 {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		result(data);
		
	}// end main()
	
	public static void result(int[] data){
		int cnt = 0;
		int sum = 0;
		
		for(int number:data) {
			if(number%5!=0 && number%2!=0) {
				cnt++;
				sum+=number;
			}
		}
		System.out.printf("2 or 5의 배수가 아닌 갯수 :%d", cnt);
		System.out.printf("2 or 5의 배수가 아닌 합계:%d", sum);
	}//end result()
	
}// end class

