package java1115_generics;
import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Java172_Generics {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		//ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<Product> tvList = new ArrayList<Tv>();
		List<Tv> tvList = new ArrayList<Tv>();
		
		productList.add(new Tv());  // public boolean add(E e) {
		productList.add(new Audio());
		
		tvList.add(new Tv());
		//tvList.add(new Audio());
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p: list)
			System.out.println(p);
	}
}





