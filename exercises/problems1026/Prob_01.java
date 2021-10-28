package java1026.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {

		int[] num = { 94, 85, 95, 88, 90 };
		int maxValue = num[0];
		
		for(int i = 0; i < num.length-1; i++) {
			if (maxValue > num[i+1]) {
				
			} else {
				maxValue = num[i+1];
			}
			
		}
		
		System.out.printf("%d",maxValue);

	}// end main()

}// end class
