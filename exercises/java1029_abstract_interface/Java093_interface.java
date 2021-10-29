package java1029_abstract_interface;
/* 
 * -(private) +(public) *(protected)
 * class와 interface를 이용하여 성적처리
 * 클래스명 : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String
 *  
 *  인터페이스명 : Score
 *  +sol:int  (초기값:20)
 *  +getScore():int
 *  
 *  인터페이스명 : Print
 *  +toPaint():String
 *  
 *  [출력화면]
 *  이름 : 홍길동
 *  점수 : 60점
 */

interface Score{
	public int sol =20;
	public int getScore();
}

interface Print{
	public String toPaint();
}

class User{
	private String name;
	public User() {
	}
	public User(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

class UserTest extends User implements Score, Print{
	int number;

	public UserTest(String name, int number) {
		super(name);
		this.number = number;
	}

	@Override
	public String toPaint() {
		return "이름:"+ toString() + "\n점수:" + getScore();
	}

	@Override
	public int getScore() {
		return sol*number;
	}


}//end class



public class Java093_interface {

	public static void main(String[] args) {
		UserTest ut = new UserTest("홍길동",3);
		System.out.println(ut.toPaint());
	}
}

/*
abstract class User{
	private String name;
	
	public User() {
	}
	public User(String name){
	}
	abstract public String toString();
}

interface Score{
	public int sol =20;
	public int getScore();
}
interface Print{
	public String toPaint();
}

class UserTest extends User implements Score,Print{
	
	UserTest(String name, int score){
		super(name);
	}
	@Override
	public String toString() {
		return null;
	}
	
	@Override
	public int getScore() {
		return 0;
	}
	@Override
	public String toPaint() {
		return toString()+getScore();
	}
}

public class Java093_interface {

	public static void main(String[] args) {
		UserTest ut = new UserTest("홍길동",3);
		System.out.println(ut.toPaint());
	}

}
*/