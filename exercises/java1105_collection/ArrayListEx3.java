package java1104_collection;

import java.util.*;

public class ArrayListEx3 {
/////////capacity는 null값 포함 //size는 null값 안 포함 실제 데이터가 들어있는 size
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();//Remove empty space
		System.out.println("===After trimToSize()===");
		print(v);
		
		v.ensureCapacity(7);
		System.out.println("===After ensureCapacity(7)===");
		print(v);
		
		v.setSize(9); //Capacity에 더해버리네?ㄴㄴ size가 capacity보다 클경우 capa*2로 일단 만듬. 2배 범위 초과시 그냥 만듬
		System.out.println("===After setSize(8)===");
		print(v);
		
		v.clear();
		System.out.println("===After clear()===");
		print(v);
	}

	
	
	
	
	
	
	
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" +v.size());
		System.out.println("capacity :" +v.capacity());
	}
}
