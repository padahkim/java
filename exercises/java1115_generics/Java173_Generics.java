package java1115_generics;
import java.util.*;

public class Java173_Generics {

	public static void main(String[] args) {
		
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홀길동", 2, 1));
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			//Student s = iterator.next();
			//Student s = (Student)iterator.next(); 원래는 iterator 가 Object class이므로 형변환 필요하나 지네릭덕분에 ㄱㅊ
			//System.out.println(s.name);
			System.out.println(iterator.next().name);
		}
	}

}

class Student{
	String name ="";
	int classInfo;
	int number;
	public Student(String name, int classInfo, int number) {
		super();
		this.name = name;
		this.classInfo = classInfo;
		this.number = number;
	}
	
	
}