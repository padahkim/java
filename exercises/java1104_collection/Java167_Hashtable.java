package java1104_collection;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable
 * 1. Map인터페이스를 구현 해 놓은 클래스
 * 2. Map인터페이스를 구현해놓은 클래스들은 key, value쌍으로 저장한다.
 * 3. value를 구분해주는 것은 key이므로 key는 중복을 허용하지 않는다.
 */

public class Java167_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(new Integer(10), "java");
		table.put(new Integer(10), "jsp");
		table.put(new Integer(10), "spring");
		
		//System.out.println(table);
		
		System.out.println(table.get(new Integer(10)));
		System.out.println("////////////////Enumeration/////////////////////");
		Enumeration<Integer> enu = table.keys();
		while(enu.hasMoreElements()) {
			
		}
	}

}
