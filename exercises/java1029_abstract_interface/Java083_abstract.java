package java1029_abstract_interface;

/*
 * 클래스(class), 추상클래스(abstract), 인터페이스(interface)
 * 메소드 정의: 메소드 선언부 + 메소드 구현부
 *  ex) public void prn(){}
 *  
 *  추상메소드: 선언부만 정의되어 있는 메소드.
 *  ex) abstract public prn();
 *  
 *  추상클래스: 추상메소드를 가지고 있는 클래스
 *  ex) abstract class Test{}
 *  
 *  추상클래스 제공 목적: 추상메소드를 강제적으로 오버라이딩하고 객체생성을 할 수 없도록 하기 위해서
 */

/*
 * Car: 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. work();
 * Sedan
 * Truck
 */
abstract class CarAbs{
	private int speed;
	private String color;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	abstract public void work();
}// end CarAbs

class Sedan extends CarAbs{
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고있음");
	}
}//end Sedan

class Truck extends CarAbs{
	@Override
	public void work() {
		System.out.println("트럭이 사람을 태우고있음");
	}
}//end Truck



public class Java083_abstract {

	public static void main(String[] args) {
		Sedan sd = new Sedan();
		sd.work();
		
		Truck tk = new Truck();
		tk.work();

	}

}
