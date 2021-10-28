package java1027_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */


class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}
	
	Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
		
	}
	
}// end class////////////////////////

public class Class_prob01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10,"pizza");
		System.out.println(c1.getArea());
		Circle c2 = new Circle(2,"dounut");
		System.out.println(c2.getArea());

	}//end main()

}//end class
