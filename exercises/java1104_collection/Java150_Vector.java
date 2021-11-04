package java1104_collection;

import java.util.Vector;

public class Java150_Vector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Integer(30));
		
		//1인덱스 요소 제거
		v.remove(1);
		
		//0인덱스에 새로운 요소 삽입
		v.add(0, new Integer(40));
		
		for(int i=0;i<v.size();i++)
			System.out.printf("[%d]=%d\n", i, v.get(i));
	}

}
