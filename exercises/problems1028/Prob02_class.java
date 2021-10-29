package java1028_class.prob01;
/*
 * 1 연봉등급을 이용해서 각 사원의 연봉등급을 출력하는 로직을 구현하시오.
 * 
 * 2 실행결과 
 *  <<연봉등급표>>
 *  1000 2000 A
 *  2001 3000 B
 *  3001 4000 C
 *  4001 5000 D
 *  
 *  <<사원의 연봉등급>>
 *  홍길동님의 연봉은 C등급입니다.
 *  이영희님의 연봉은 A등급입니다.
 */
class SalesGrade {
	int upper_salary;
	int bottom_salary;
	char grade;

	SalesGrade(int bottom_salary, int upper_salary, char grade) {
		this.bottom_salary = bottom_salary;
		this.upper_salary = upper_salary;
		this.grade = grade;
	}

	public String toString() {
		return bottom_salary + " " + upper_salary + " " + grade;
	}
}

public class Prob02_class {

	public static void main(String[] args) {
		SalesGrade[] sg = new SalesGrade[4];
		sg[0] = new SalesGrade(1000, 2000, 'A');
		sg[1] = new SalesGrade(2001, 3000, 'B');
		sg[2] = new SalesGrade(3001, 4000, 'C');
		sg[3] = new SalesGrade(4001, 5000, 'D');

		System.out.println("<<연봉등급표 출력>>");
		display(sg);

		System.out.println("<<사원의 연봉등급 출력>>");
		display(sg, "홍길동", 3500);
		display(sg, "이영희", 1800);

	}// end main()

	public static void display(SalesGrade[] sg) {
		// 연봉등급표를 출력하는 로직구현
		for (SalesGrade data: sg) {
			System.out.println(data.toString());
		  //System.out.printf("%d %d %s\n" ,data.hisal,data.losal,data.grade);
		}

	}// end display()

	public static void display(SalesGrade[] sg, String name, int sales) {
		// 사원의 연봉등급을 출력하는 로직구현
		for(int i=0; i<sg.length;i++) {
			if(sales>=sg[i].bottom_salary && sales<=sg[i].upper_salary)
				System.out.printf("%s님의 연봉은 %s등급입니다\n",name, sg[i].grade);
		}
		
		
		
		//System.out.printf("%d\n",sg[0].bottom_salary);
		//System.out.print("왜안나옴\n"+sg[0].bottom_salary);
		
		
		/*
		if(sales<=2000)
			System.out.printf("%s님의 연봉은 A 등급입니다\n",name);
		else if (sales>=2001 && sales<=3000)
			System.out.printf("%s님의 연봉은 B 등급입니다\n",name);
		else if (sales>=3001 && sales<=4000)
			System.out.printf("%s님의 연봉은 C 등급입니다\n",name);
		else
			System.out.printf("%s님의 연봉은 D 등급입니다\n",name);
		*/
	}// end display()

}// end class
