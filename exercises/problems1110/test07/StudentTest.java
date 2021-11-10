package ncs.test07;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("kim",25,176,66,"201401", "Industrial Engineering");
		students[1] = new Student("lee",25,155,50,"201801", "Mathmatics");
		students[2] = new Student("jack",27,175,81,"201601", "English");
		for(int i=0 ; i<students.length ; i++)
			System.out.println(students[i].toString());;
	}

}
