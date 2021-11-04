package java1104_collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Java161_LinkList {

	public static void main(String[] args) {
		
		LinkedList<String> aNode = new LinkedList<String>();
		//추가 (append)
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		
		
		ListIterator<String> ite = aNode.listIterator();
		System.out.println("앞->뒤");
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("뒤->앞");
		while(ite.hasPrevious())
			System.out.println(ite.previous());
	}

}
