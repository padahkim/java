package java1117_lamda_stream;

public class Java177_lamda {

	public static void main(String[] args) {
		/*Object obj = (a, b) -> a > b ? a : b
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a:b;
			}
		};
		
		int value = obj.max(3,5);//함수형인터페이스가 필요*/
		
		MyFunction1 f = new MyFunction1() {
			public int max(int a, int b) {//오버라이딩 규칙-접근제어자는 좁게 못바꾼다(부모의 접근 제어자보다 축소된 범위를 가질 수 없다) Cannot reduce the visibility of the inherited method from //public 붙여야함
				return a > b ? a:b;
			}
		};
		//람다식(익명 객체)를 다루기 위한 참조변수의 타입(예제에선 Myfunction)은 함수형 인터페이스의 타입(Myfunction)과 같아야 한다
		//Myfunction f = (a,b)->return a > b ? a:b 위에것을 한줄로 줄이면 이거
		
		int value = f.max(3,5);//함수형인터페이스가 필요*/
		System.out.println("value="+value);
		
	}//end main



	
}

@FunctionalInterface//함수형 인터페이스는 단 하나의 추상메서드만 가져와야함
interface MyFunction1 {
	//public abstract int max(int a, int b);  인터페이스의 모든 메서드 public abstract가 붙어있으므로 생략가능
	int max(int a, int b);
}
	