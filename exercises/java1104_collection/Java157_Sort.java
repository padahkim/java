package java1104_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class Java157_Sort {

	//오름차순
	public static Comparator<Integer> asc = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
	};
	
	//내림차순
	public static Comparator<Integer> desc= new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	};
	
	
	
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,3,5,2,4};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		//오름차순(ascending)
		//list.sort(asc);
		//내림차순
		list.sort(desc);
		
		for(Integer data : list)
			System.out.println(data);
	}

}
