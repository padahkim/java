package java1104_collection;

import java.util.*;


public class IteratorEx1 {

	public static void main(String[] args) {
		
		Collection <String> list1 = new ArrayList<String>();
		//Collection<String> list1 = new HashSet<String>();
		//Collection<String> list1 = new TreeSet<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		Iterator it = list1.iterator();
		
		while(it.hasNext()) {
		Object obj = it.next();
		System.out.println(obj);
		}
		
	}
}
