package java1117_collection.prob;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 2 
 * 10 
 * 4 
 * 6
 */
public class Prob002_ArrayList {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 2, 7 };
		int[] num = { 1, 10, 15, 4, 6 };
		ArrayList<Integer> v = merge(arr, num);
		for (Integer it : v)
			System.out.println(it);
	}// end main()

	public static ArrayList<Integer> merge(int[] arr, int[] num) {
		// arr,num배열을 병합한후 2의 배수만 리턴하는 프로그램을 구현하시오.
			ArrayList<Integer> arrayList = new ArrayList<>();
			ArrayList<Integer> newList = new ArrayList<>();
			for(int arrElement: arr)
				arrayList.add(arrElement);
			for(int numElement: num)
				arrayList.add(numElement);
			
			for(Integer data: arrayList)
				if(data%2==0)
					newList.add(data);
			
					
					
			
		return newList;

	}// end merge();

}






