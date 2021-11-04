package java1104_collection;

import java.util.Vector;

public class Java149_Vector {

	public static void main(String[] args) {
		//Vector생성자에 인자값이 없으면 용량의 기본값은 10이다
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java"));
		
		System.out.println("용량:"+v.capacity());
		System.out.println("크기"+v.size());
		
		//아무 값 지정 안해두면 용량이 두배씩 증가됨
		v = new Vector<String>(2);
		v.addElement(new String("Seoul"));
		v.addElement(new String("busan"));
		v.addElement(new String("incheon"));
		System.out.println("용량:"+v.capacity());
		System.out.println("크기"+v.size());
		
		//첫번째 인자 2는 최초 메모리 생성용량, 두번째 1인자는 증가되는 값을 설정해주는것도 가능
		v = new Vector<String>(2,1);
		v.addElement(new String("홍길동"));
		v.addElement(new String("이영희"));
		v.addElement(new String("영희"));
		System.out.println("용량:"+v.capacity());
		System.out.println("크기"+v.size());
		
	}

}
