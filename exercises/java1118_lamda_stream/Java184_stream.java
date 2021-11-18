package java1117_lamda_stream;

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.*;


public class Java184_stream {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
					new Student("이자바", 3, 300),
					new Student("김자바", 1, 200),
					new Student("안자바", 2, 250),
					new Student("박자바", 1, 190),
					new Student("소자바", 1, 180),
					new Student("윤자바", 3, 270),
					new Student("조자바", 3, 280)
				);
		                                           //(Student s)->s.getClassNumber()
		studentStream.sorted(Comparator.comparing(Student::getClassNumber).reversed()//반별정렬
				.thenComparing(Comparator.naturalOrder()))//기본정렬
				.forEach(System.out::println);
	}	
}

class Student implements Comparable<Student> {
	
	String name;
	int classNumber;
	int totalScore;
	
	public Student(String name, int classNumber, int totalScore) {
		super();
		this.name = name;
		this.classNumber = classNumber;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, classNumber, totalScore);
	}
	
	String getName() {return name;}
	int getClassNumber() {return classNumber;}
	int getTotalScore() {return totalScore;}
	
	//총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) {
		return s.totalScore - this.getTotalScore();
	}
}
