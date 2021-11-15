package java1115_api.prob;

public class Person {
	long id;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(long id) {
		super();
		this.id = id;
	}
	
	
	public Object eq(Object obj) {
		return this;
	}
	
	
	public boolean equals(Object obj) {
		System.out.println(obj);
		return true;
	}
}
