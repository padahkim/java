package java1104_collection;

import java.util.ArrayList;

public class Java154_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);

	}//end main()
	
	public static String[] display(ArrayList<String> aList) {
		String[] sn = new String[aList.size()];
		/*
		for(int i=0; i<sn.length; i++) {
			sn[i]=aList.get(i);
		}
		return sn;*/
		
		/*Object[] obj = aList.toArray();
		Object[] obj = aList.toArray();
		String[] sg = new String[obj.length];
		for(int i=0;i<sg.length;i++)
			sg[i]=(String)obj[i];
		return sg
		*/
		
		/*
		String[] line = new String[aList.size()];
		String[] arr = aList.toArray(line);
		*/
		
		
		return aList.toArray(new String[aList.size()]);
	}//end display()

}//end class
