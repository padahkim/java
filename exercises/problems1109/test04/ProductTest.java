package ncs.test04;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pr = new Product();
		
		String name = sc.nextLine();
		int price = sc.nextInt();
		int quantity = sc.nextInt();
		
		pr.setName(name);
		pr.setPrice(price);
		pr.setQuantity(quantity);
		
		System.out.println(pr.information());
		
	}

}
