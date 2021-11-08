package selfstudy1108;

public class ch8_12_exception {

	public static void main(String[] args) throws Exception{
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
