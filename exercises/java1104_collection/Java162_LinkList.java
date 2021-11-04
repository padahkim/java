package java1104_collection;


import java.util.LinkedList;
import java.util.ListIterator;

public class Java162_LinkList {

	public static void main(String[] args) {
		LinkedList<String> aNode = new LinkedList<String>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		ListIterator<String> ite = aNode.listIterator(2);
		while(ite.hasNext())
			System.out.printf("[%d]=%s\n", ite.nextIndex(), ite.next());
		
		System.out.println("/////////////////////////");
		while(ite.hasPrevious())
			System.out.printf("[%d]=%s\n", ite.previousIndex(), ite.previous());
	}

}
