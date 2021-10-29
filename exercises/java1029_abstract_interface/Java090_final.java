package java1029_abstract_interface;

/*
 * final: 클래스, 변수, 메소드에서 사용가능
 * 
 * 변수: 상수로 사용되며 변수명 모두 대문자로 사용하도록 권장한다.
 * 메소드에 씀: 오버라이딩 금지시킴(상속은 가능-자식이 사용가능)
 * 클래스: 상속을 할 수 없다.
 */

class TestFinal{
	int age = 25;
	final int CHECK = 1;
	
}

class Root{
	final void display() {
		System.out.println("display");
	}
}

class ColorA extends Root{
	/* void display() {
	   }
	*/	
}
final class Red{
	
}
//class Blue extends Red{} 이거 에러암 final은 상속불가

public class Java090_final {

	public static void main(String[] args) {
		TestFinal ft = new TestFinal();
		ft.age = 40;
		//ft.CHECK = 2;
		ColorA ca = new ColorA();
		ca.display();
	}

}
