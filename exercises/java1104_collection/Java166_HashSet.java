package java1104_collection;

import java.util.HashSet;

public class Java166_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(10));
		
		for(Integer it : set)
			System.out.println(it);
	}

}
