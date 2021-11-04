package java1104_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1 FIFO(First In First Out) : 제일 먼저 저장한 요소를 제일 먼저 꺼내온다.
 * 2 최근사용문서, 인쇄작업대기목록, 버퍼
 */


public class Java164_LinkList {

	public static void main(String[] args) {
		LinkedList<String> aNode = new LinkedList<String>();
		//
		aNode.offer(new String("java"));
		aNode.offer(new String("jsp"));
		aNode.offer(new String("spring"));
		
		System.out.println(aNode);
		
		while(!aNode.isEmpty())
			System.out.println(aNode.poll());
		
		System.out.println(aNode);
	}

}
