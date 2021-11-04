package java1104_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 * 
 * 
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



	@Override
	public String toString() {
		return name+" " +age;
	}
	
}

public class Java148_Vector {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("이영희", 25);
		
		Person[] arr = new Person[2];
		arr[0]=new Person("홍길동", 30);
		arr[1]=new Person("이영희", 25);
		
		Vector<Person> vt = new Vector<Person>();
		vt.addElement(new Person("홍길동", 30));
		vt.addElement(new Person("홍길님", 35));
		vt.addElement(new Person("홍동이", 44));
		for(Person ps: vt)
			System.out.printf("%s %d\n", ps.name, ps.age);
		
		
	}

}
