package java1104_collection;

import java.util.Iterator;
import java.util.TreeSet;


public class Java165_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree =  new TreeSet<Integer>();
		tree.add(new Integer(10));
		tree.add(new Integer(40));
		tree.add(new Integer(20));
		tree.add(new Integer(10));
		
		System.out.println("오름차순");
		for(Integer it : tree)
			System.out.println(it);
		System.out.println("///////////////////////////////");
		Iterator<Integer> ite = tree.iterator();
			/*while(ite.hasNext())
				System.out.println(ite.next());
			*/
			System.out.println("내림차순");
			ite = tree.descendingIterator();
			while(ite.hasNext())
				System.out.println(ite.next());
			
	}

}
