package java1029_abstract_interface;
/*
 * 			class		interface
 * 멤버변수	O			상수
 * 메소드		선언부+구현부	선언부(추상메소드)
 * 생성자		O			X
 * 초기화블럭	O			X
 * 내부클래스    O			O
 * 
 * extends : 클래스에 클래스를 상속, 단일상속
 * implements : 클래스에 인터페이스를 상속, 다중상속
 * 
 * 인터페이스(interface)
 * 1 추상메소드와 상수를 가지고 있는 형태이다.
 * 2 클래스 작성에 도움을 줄 목적으로 제공이되는 표준명세서이다.
 *    mysql  			 oracle           mssql
 *    getConnection()    getStart()    getInit()
 *    
 *    DB연결 : getConnection(), executeQuery()
 * 3 implements : 클래스에 인터페이스를 상속할때 사용되는 키워드이다.
 * 4 인터페이스는 접근제어자로 public만 제공된다.
 * 5 인터페이스의 추상메소드에 abstract키워드를 명시하지 않아도 된다.
 *   자바가상머신에서 자동으로 처리하기 때문에...
 */
interface CarRun{
	int carCount = 5;//final이 내부적으로 처리-상수로 사용되므로
	//CarRun(){}생성자 사용 불가
	//static {} 사용 불가
	//void display() {}바디가 구현된 메소드도 불가
	void prn();//추상메서드 사용가능
	class Sun {}//내부 클래스 사용 가능
} //end CarRun

interface Play{
	
}

class TruckRun implements CarRun, Play{
@Override
	public void prn() {
	System.out.println("prn");
	}//이거 안넣으면 에러뜸 why? 인터페이스 전부 에서 추상클래스를 안받아오면 여기에도 abstract붙여줘야함 
}

public class Java091_interface {

	public static void main(String[] args) {
		System.out.println(CarRun.carCount);//이렇게 사용되므로  carCount에 static이 붙어있는거임
		
		//CarRun cr = new CarRun(); 인터페이스는 생성자로 초기화 불가
		
		TruckRun tr = new TruckRun();
		tr.prn();
		
	}

}
