package java1026.prob;

/*
 * 배열에 저장된 요소의 갯수만큼 문자를 출력하는 프로그램을 구현하시오.
 * 출력결과
 * @@@
 * @@
 * @@@@@
 * @@@@@@
 * @
 */

public class Prob_04 {

	public static void main(String[] args) {
		int num[]=new int[]{3,2,5,6,1};
		
		for (int i=0; i<num.length; i++) {
			//System.out.println(num[i]);
			for(int j=0; j < num[i]-1;j++) {
				System.out.printf("@");
			}
			System.out.println("@");
		}
		
		
	}//end main()

}//end class
