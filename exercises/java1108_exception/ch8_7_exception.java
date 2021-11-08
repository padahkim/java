package selfstudy1108;

public class ch8_7_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(5);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				ae.printStackTrace();
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println();
	}

}
