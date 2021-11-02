package java1102_api;
//import java.lang.Math java.lang은 자동으로 탑재되어있음//Math치기 귀찮을 때 E라는알파벳 밑에처럼해줌
import static java.lang.Math.E;
import static java.lang.Math.sqrt;
import static java.lang.Math.*;

/*
 * 클래스에서 static키워드가 선언된 멤버변수, 메소드를 호출할 때
 * import static을 선언하면 클래스명 없이 바로 멤버변수, 메소드를 호출할 수 있다.
 */

public class Java125_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);//원주율
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10, 20));
		
		System.out.println(E);
		System.out.println(sqrt(25));
		System.out.println(pow(2,3));
		
	}

}
