package Java1101_api;

/*
* JAVA API(Application Programming Interface)
* Object
* 1 클래스 중에서 최상의 클래스이다.
* 2 Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
* 3 java.lang패키지에서 제공하는 클래스이다.
*/

public class Java103_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		//java.lang.Object@15db9742
		System.out.println(obj.toString());
		
		int x = 5;
		int y = 5;
		//값비교(기본데이터)
		System.out.printf("x=%d y=%d x==y:%b\n", x, y, x==y);
		
		Object ojt = new Object();
		System.out.println(ojt.toString());
		//==(주소비교)(참조데이터)
		System.out.printf("obj==ojt:%b\n", obj==ojt);
		//qeuals(): 주소비교- 객체비교만 가능하다
		System.out.printf("obj.equals(ojt):%b\n" ,obj.equals(ojt));
		
		System.out.println(obj.getClass());
		//클래스만 가져오고 싶을시 겟네임을 더해줌
		System.out.println(obj.getClass().getName());
		//java.lang.Object@15db9742
		System.out.println(obj);
		System.out.println(obj.toString());
	}

}
