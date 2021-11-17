package java1117_collection.prob;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
/*
 * [출력결과]
 * 찾는 도서명을 입력 :java
 * 책이름 : java
 * 책저자 : kim
 * 페이지 : 100
 * 
 * 찾는 도서명을 입력 :jsp
 * 찾는 도서가 없습니다
 */

public class Prob004_HashMap {
	public static void main(String[] args) {
		BookShop bk1=new BookShop("java","kim",100);
		BookShop bk2=new BookShop("c++","lee",250);
		BookShop bk3=new BookShop("oracle","park",300);
		BookShop[] bs=new BookShop[3];
		bs[0]=bk1;
		bs[1]=bk2;
		bs[2]=bk3;
		display(bs);
		
	}
	
	public static void display(BookShop[] bs){
		Map<String,BookShop> map=new HashMap<String,BookShop>();
		map.put(bs[0].getTitle(), bs[0]);
		map.put(bs[1].getTitle(), bs[1]);
		map.put(bs[2].getTitle(), bs[2]);
		
		//출력결과를 참조하여 구현하세요.
		while(true) {
			Scanner sc = new Scanner(System.in);
			String book=sc.next();
			System.out.println("찾는 도서명을 입력:"+book);
			if(!map.containsKey(book))
				System.out.println("그책없소이다");
			else {
				BookShop bss = map.get(book);
				String name = bss.getTitle();
				String author = bss.getAuthor();
				int page = bss.getPage();
				System.out.println(author);
				System.out.printf("책이름:%s\n책저자:%s\n페이지:%d\n",name,author,page);
			}
		}
		
	}
}
//Map의 경우에 원소에 접근할 때 인자로 받은 객체를 get 리턴받아서 거기서 접근해야함






/** 원래 문제
 * public class Prob004_HashMap {
	public static void main(String[] args) {
		BookShop bk1=new BookShop("java","kim",100);
		BookShop bk2=new BookShop("c++","lee",250);
		BookShop bk3=new BookShop("oracle","park",300);
		BookShop[] bs=new BookShop[3];
		bs[0]=bk1;
		bs[1]=bk2;
		bs[2]=bk3;
		display(bs);
		
	}
	
	public static void display(BookShop[] bs){
		Map<String,BookShop> map=new HashMap<String,BookShop>();
		map.put(bs[0].getTitle(), bs[0]);
		map.put(bs[1].getTitle(), bs[1]);
		map.put(bs[2].getTitle(), bs[2]);
		
		
		//출력결과를 참조하여 구현하세요.
		System.out.println(map);
	}
}
 */




