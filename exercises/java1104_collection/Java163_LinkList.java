package java1104_collection;

import java.util.LinkedList;
/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */
public class Java163_LinkList {

	public static void main(String[] args) {
		LinkedList<String> aNode = new LinkedList<String>();
		//추가
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		//System.out.println(aNode.get(2));
		//for (int i=0; i<aNode.size(); i++)
			//System.out.println(aNode.pop());
		
		while(!aNode.isEmpty())
			System.out.println(aNode.pop());
		
		System.out.println(aNode);
	}

}
