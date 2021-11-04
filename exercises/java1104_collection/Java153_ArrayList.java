package java1104_collection;

import java.util.ArrayList;

public class Java153_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
	}
	
	public static void prnDisplay(ArrayList<String> aList) {
		// aList 매개변수에서 'j'가 포함되어 있는 요소만 출력하는 프로그램을 구현
		 for(String sn: aList) {
			//if(sn.contains("j"))
			 if(sn.contains(".*[jJ].*"))
				System.out.println(sn);
		 	}
		 }
}
