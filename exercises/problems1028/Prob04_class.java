package java1028_class.prob01;
import java.lang.String;

/* 1 display()메소드에서 code별 가격합계를 구현하는 프로그램을 구현하시오.
 * 
 * 2 출력결과
 *   computer 75000
 *   novel  25000
 * 
 */
class BookShop {
	//멤버변수
	String title;
	String genre;
	int price;

	BookShop(String title, String genre, int price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
}

public class Prob04_class {

	public static void main(String[] args) {
		BookShop[] shop=new BookShop[5];
		shop[0]=new BookShop("Java의 정석","computer",20000);
		shop[1]=new BookShop("나그네","novel",10000);
		shop[2]=new BookShop("실무에 바로쓰는 엑셀","computer",25000);
		shop[3]=new BookShop("초인","novel",15000);
		shop[4]=new BookShop("웹구현 JSP","computer",30000);
		display(shop);
		
		}//end main()	
		
		public static void display(BookShop[] shop){
			String name;
			int sumNovelPrice=0;
			int sumComputerbookPrice=0;
			
			for (BookShop data:shop) {
				if(data.genre=="computer") 
					sumNovelPrice+=data.price;
				 else 
					 sumComputerbookPrice+=data.price;
			}
			System.out.printf("computer %d\n",sumNovelPrice);
			System.out.printf("novel %d",sumComputerbookPrice);
			
			
			
		}//end display()

}//end class
