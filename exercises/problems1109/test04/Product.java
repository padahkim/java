package ncs.test04;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product() {};
	
	
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
	public String information() {
		String price1 = String.valueOf(getPrice());
		String quantity1 = String.valueOf(getQuantity());
		String sum = String.valueOf(getPrice()*getQuantity());
		return "상품명 : "+name+"\n"+"가격 :"+price1+"원\n"+"수량:"+quantity1+"개\n"+"총 구매 가격:"+sum+"원";
		//String.format()으로 리턴하면 형변환 없이 가능
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
