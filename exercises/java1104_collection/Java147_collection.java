package java1104_collection;

import java.util.Vector;
/*
 * 컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다.
 * 제너릭(generic): 컬렉션 클래스에 저장된 객체를 가져올때
 *  다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */


public class Java147_collection {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		
		Integer it = v.get(0);
		System.out.println(it);
		
		System.out.println("=========== 일반 반복문 =======================");
		for (int i=0; i<v.size(); i++)
			System.out.println(v.get(i);
			
		System.out.println("=========== 개선된 루프 =======================");
		//for(데이터 타입 변수 : colloction, 배열){}
		for (Integer ig : v)
			System.out.println(ig);
		
		
		System.out.println("============================================");
		Vector<Number> vt = new Vector<Number>();
		//Integer->Number->Object (up-casting)
		vt.addElement(new Integer(10));
		//Double->Number->Object (up-casting)
		vt.addElement(new Double(10.4));
		//Float->Number->Object (up-casting)
		vt.addElement(new Float(4.8F));
		
		for(Number ne : vt) {
			if(ne instanceof Integer) {
				Integer ig = (Integer)ne;
				System.out.println(ig);
			}else if(ne instanceof Double) {
				Double de = (Double)ne;
				System.out.println(de);
			}else if(ne instanceof Float) {
				Float ft = (Float)ne;
				System.out.println(ft);
			}
		}
	}

}
