package java1104_collection;
/*
 * [프로그램 출력결과]
   kim   56  78   12  146
   hong   46  100  97  243
   park   96  56   88  240   
 */
//name one two three total

import java.util.Scanner;
import java.util.Vector;

class Sawon{
	String name;
	int one;
	int two;
	int three;
	
	public Sawon() {
	}

	public Sawon(String name, int one, int two, int three) {
		super();
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	private int count() {
		return one+two+three;
	}
	
	@Override
	public String toString() {
		return name+" " +one+" " +two+" " +three+" "+count();
	}
}


public class Java151_Vector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Sawon> v = new Vector<Sawon>();
		while(true) {
			System.out.print("입력");
			String[] line = sc.nextLine().split("\\s+");
			Sawon sa = new Sawon();
		}
		String[] line = as.nextLine().split("\\s+")//+붙이면 빈칸 공백 하나 이상이라는 뜻
				
		System.out.println("name one two three를 차례로 입력하셈");
		
		Sawon s = new Sawon();
		s.name = sc.next();
		s.one = sc.nextInt();
		s.two = sc.nextInt();
		s.three = sc.nextInt();
	}

}
