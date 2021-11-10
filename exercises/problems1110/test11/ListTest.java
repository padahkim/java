package ncs.test11;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add((int)Math.floor(Math.random()*99+1));	
		}
		
		display(list);
		
		list.sort(new Decending());
		
		display(list);
		
		
		/*
		int a = (int)Math.floor(Math.random()*99+1);
		System.out.println(a);
		*/
	}
	
	public static void display(List list){
		System.out.println(list);
	}
}
