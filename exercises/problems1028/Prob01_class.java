package java1028_class.prob01;

/* 출력력과처럼 총합계까지 출력이 되도록 main()메소드에 
 * 로직을 추가하세요.
 * 
 * [출력결과]
 * 연평해전 14000
 * 극비수사 22500
 * 소수의견 14000
 * 총합계: 50500
 */

class MovieShop {
	String name;
	int price;
	int person;

	public MovieShop() {

	}

	public MovieShop(String name, int price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
	}

	public int countMoney() {
		return price * person;
	}

	public void prn() {
		System.out.printf("%s %d\n", name, countMoney());
	}

}// end class

public class Prob01_class {

	public static void main(String[] args) {
		int sum = 0;
		MovieShop[] me = new MovieShop[3];
		me[0] = new MovieShop("연평해전", 7000, 2);
		me[1] = new MovieShop("극비수사", 7500, 3);
		me[2] = new MovieShop("소수의견", 7000, 2);
		// 여기에 구현하세요/////////////////
		/*
		for(int i = 0; i < me.length; i++) {
			me[i].prn();
		}
		*/
		for(MovieShop data: me) {
			data.prn();
		}
		
		
		//////////////////////////

	}// end main()

}// end class

