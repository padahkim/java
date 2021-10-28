package java1026.prob;
/*
 * num배열의 합계와 평균을 구하는 프로그램을 구현하시오.
 *  출력결과
 *  합계: 243
 *  평균:  81
 */

public class Prob_03 {

	public static void main(String[] args) {
       int num[]=new int[]{60,95,88};
       int total=0;
       int average;
       
       for (int i=0;i<num.length;i++) {
    	   total+=num[i];
       }
       	   average=total/num.length;
       	   
       System.out.printf("total:%d average:%d",total, average);
	}//end main()

}//end class
