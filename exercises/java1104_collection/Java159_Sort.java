package java1104_collection;

import java.util.ArrayList;
import java.util.Comparator;
/*
 * 이연경 40
 * 가비 30
 * 가비 20
 * 마티스 15
 */

class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+ "  "+ age;
	}
}

public class Java159_Sort {
	
	public static Comparator<Person> tt = new Comparator<Person>() {
		
		public int compare(Person o1, Person o2) {
			//o1.name.compareTo(o2.name) :오름차순
			//o2.name.compareTo(o1.name) :내림차순
			
			
		//return o1.name.compareTo(o2.name)
			if(!(o1.name.equals(o2.name)))
				return o2.name.compareTo(o1.name);
			/*
			else if(o1.age > o2.age)
				return 1;
			else if(o1.age < o2.age)
				return -1;
			else
				return 0;
				*/
			else 
				 return (new Integer(o2.age)).compareTo(new Integer(o1.age));
			
		}
	};

	public static void main(String[] args) {
		ArrayList<Person> aList = new ArrayList<Person>();
		
		aList.add(new Person("이연경",40));
		aList.add(new Person("가비",30));
		aList.add(new Person("가비",20));
		aList.add(new Person("마티즈",15));
		
		System.out.println(aList);
	}//end main

}//end class
