package jungsuk;

class Product {
	int price;
	int bonusPoint;
	
	  Product(int price) {
		  this.price = price;
		  bonusPoint = price/10;
	  }
}

class Tv1 extends Product{
	Tv1() {
		super(100);
	}
	
	public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer() {
		super(200);
		}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio() {
		super(50);
	}
	public String toString() {return "Audio";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product [] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 살 수 없습니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"을 구입하셨습니다");
	}
	void summary() {
		int sum = 0;
		String itemList ="";
		for(Product data:cart) {
			if(data==null) break;
			sum += data.price;
			itemList += data + ",";
		}
		System.out.println("구입하신 총 금액"+sum+"원입니다");
		System.out.println("구입하신 총 금액"+itemList+"원입니다");
	}
	
}

public class java027_parameter_polymorphism {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());//Tv1 t = new Tv1(); b.buy(t)를 줄인것
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
		
		System.out.println("현재 남은 돈은"+b.money);
		System.out.println("현재 bonus point"+b.bonusPoint);
	}
}
