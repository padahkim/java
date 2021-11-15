package java1115_generics;

import java.util.*;

public class Java174_Generics {

public static void main(String[] args) {
		HashMap<String, Student1> map = new HashMap<>();
		map.put("자바왕", new Student1("자바왕",1,1,80,90,100));
		
		Student1 s = map.get("자바왕");
		
		System.out.println(map);
	}//main

}

class Student1{
	String name ="";
	int classInfo;
	int number;
	int kor;
	int eng;
	int math;
	
	public Student1(String name, int classInfo, int number,int kor, int eng, int math) {
		super();
		this.name = name;
		this.classInfo = classInfo;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}