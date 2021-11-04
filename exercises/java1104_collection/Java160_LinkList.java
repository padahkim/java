package java1104_collection;

import java.util.ArrayList;
import java.util.LinkedList;
/*
 * 
 * 
 * 
 */


public class Java160_LinkList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		System.out.println(aList);
		
		System.out.println("//////////////////////////");
		
		LinkedList<String> aNode = new LinkedList<String>();
		
		//추가 (append)
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		System.out.println(aNode);
		
		//삽입(insert)
		aNode.add(1, new String("ajax"));
		
		//삭제
		aNode.remove(2);
		
		System.out.println(aNode);
	}

}
