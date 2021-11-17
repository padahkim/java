package java1117_collection.prob;

import java.util.ArrayList;
import java.util.*;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		
		System.out.println(kind);
		int total = 0;
		
		for(BookDTO data: bookList) {
			if(data.getKind()==kind)
				total += data.getRentalPrice();
		}
		
		
		/*
		Iterator iterator = bookList.iterator();
		Iterator iterator2 = bookList.iterator();
		while(iterator.hasNext())
			if(((BookDTO) iterator.next()).getKind()==kind)
				System.out.println(((BookDTO) iterator2.next()).getRentalPrice());
			//System.out.println(((BookDTO) iterator.next()).getRentalPrice());
			//System.out.println(((BookDTO) iterator2.next()).getKind());
		*/
		return total;
	}//end getRentalPrice()
}//end class






