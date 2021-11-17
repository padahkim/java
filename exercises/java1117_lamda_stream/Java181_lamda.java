package java1117_lamda_stream;

import java.util.ArrayList;
import java.util.*;

public class Java181_lamda {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add(i);
		
		//list의 모든 요소를 출력
		list.forEach(i->System.out.println(i));
		/*System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
		
		//list에서 2또는 3의 배수를 제거
		list.removeIf(i->i%2==0||i%3==0);
		System.out.println(list);
		//*10
		list.replaceAll(i->i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map의 모든 요소를 {k,v}형식으로 출력
		map.forEach((k,v)->System.out.print("{"+k+","+v+"},"));
		System.out.println();
		
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}

}
