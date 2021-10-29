package java1029_inheritance;
/*
 * 오버라이딩(overriding)
 * 1 조상클래스의 메소드를 자손클래스에서 재정의(메소드의 구현부)하는 기능이다.
 * 2 메소드의 선언부는 그대로 사용한다(리턴타입, 메소드명, 매개변수)
 *   단, 접근제어자는 같거나 크면된다.
 *     private < default < protected < public 
 * 3 오버라이딩은 상속을 받은후 할 수 있다.
 * 
 * super
 * 1. 자손 클래스에서 조상클래스를 호출할때 사용한다.
 * 2. super.멤버변수
 *    super.메소드()
 *    super( ) => 생성자
 *    
 *  overloading    vs   overriding
 *  this           vs    super       
 */

class First{
	int a = 10;
	
	void prn() {//private붙일시 오버라이딩 상관없이 따로 정의해놓은 것일뿐
		System.out.println("a=" + a);
	}
}

class Second extends First {
	int b = 20;
	//상속을 받은 후 오버라이딩을 할 수  있다.
	//prn()메소드 오버라이딩시 접근제어자로 default,protected,public 가능
	@Override//annotation 오타같은거 있을 시 override가 아니면 빨간줄 쳐줌
	void prn() {
		System.out.println("b=" + b);
	}
	
}

public class Java078_inhe {

	public static void main(String[] args) {
		Second sc = new Second();
		sc.prn();
		First f = new First();
		f.prn();
	}

}
