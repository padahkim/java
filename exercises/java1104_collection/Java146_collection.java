package java1104_collection;

import java.util.Vector;

public class Java146_collection {

	public static void main(String[] args) {
		
		//coleection에 저장된 모든 element들은 object로 저장된다.
		Vector v = new Vector();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		v.addElement(new Integer(40));
		
		
		
		//auto boxing -> up-casting
		//int -> Integer -> Object
		v.addElement(50);
		
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		
		Integer it = (Integer)v.get(0);
		System.out.println(it.intValue());
		
		v.get(4);
	}

}
