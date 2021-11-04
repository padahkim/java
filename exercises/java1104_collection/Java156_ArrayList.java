package java1104_collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Java156_ArrayList {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		//열거형 : Enumeration은 Vector와 Hashtable에서만 제공한다
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		System.out.println("////////////////////////////");
		//반복자 Iterator
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		
		System.out.println("////////////////////////////");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		
		Iterator<String> ite2 = aList.iterator();
		while(ite2.hasNext())	
			System.out.println(ite2.next());
	}

}
