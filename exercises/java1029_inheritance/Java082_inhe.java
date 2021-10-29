package java1029_inheritance;
/* 
[출력결과]
삼성        SHV-E250S   	 	200000
삼성        SHV-E160S    	180000
아이폰       A1586 	    	250000
아이폰       A1524 	    	220000
LG      LG-F700L 	    190000
LG      LG-F650L 	    180000
***************************************************
삼성         SHV-E250S  200000 010-2534-2532   SK
아이폰      A1586      250000 010-2532-5902   LG
LG     LG-F650L    180000 010-7280-5283   KT
아이폰      A1524      220000 010-2259-3052   LG

*/
class HandPhone {
	private String maker;
	private String model;
	private int price;
	
	
	public HandPhone(String maker, String model, int price) {
		super();
		this.maker = maker;
		this.model = model;
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void display(){
		System.out.printf("%-4s %-10s %6d\n",maker, model, price);
	}
}

	class SmartPhone extends HandPhone{
		private String number;
		private String type;
		
		public SmartPhone(String maker, String model, int price, String number, String type) {
			super(maker,model,price);
			this.number=number;
			this.type=type;
		}
		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		@Override
		public void display() {
			System.out.printf("%-4s %-10s %6d %s %s\n",getMaker(),getModel(),getPrice(),getNumber(),getType());
		}
		
	}//end smartphone


public class Java082_inhe {

	public static void main(String[] args) {
		HandPhone[] hphone = new HandPhone[6];
		hphone[0] = new HandPhone("삼성","SHV-E250S",200000);
		hphone[1] = new HandPhone("삼성","SHV-E160S",180000);
		hphone[2] = new HandPhone("아이폰","A1586",250000);
		hphone[3] = new HandPhone("아이폰","A1524",220000);
		hphone[4] = new HandPhone("LG","LG-F700L",190000);
		hphone[5] = new HandPhone("LG","LG-F650L",180000);
		for(HandPhone data: hphone)
			data.display();
		System.out.println("***********************************");
		SmartPhone[] sphone = new SmartPhone[4];
		sphone[0] = new SmartPhone("삼성","SHV-E250S",200000,"010-2534-2532","SK");
		sphone[1] = new SmartPhone("아이폰","SHV-E250S",200000,"010-2534-2532","SK");
		sphone[2] = new SmartPhone("LG","SHV-E250S",200000,"010-2534-2532","SK");
		sphone[3] = new SmartPhone("아이폰","SHV-E250S",200000,"010-2534-2532","SK");
		for(SmartPhone data:sphone)
			data.display();
		
		
	}

}
