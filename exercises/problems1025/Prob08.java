package java1025.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob08 {

	public static void main(String[] args) {
		int money = 7777; 
		int leftMoney = 7777;
		int moneyArray[] = {500,100,50,10,1};
		int numberOfCoin;
		
		for(int i = 0; i < moneyArray.length; i++) {
			numberOfCoin = leftMoney/moneyArray[i];
			System.out.printf("%d원: %d개\n",moneyArray[i],numberOfCoin);
			leftMoney = money%moneyArray[i];
		}
		
		
		
		//여기에 작성하시오.
		
		
	}//end main()

}//end class


