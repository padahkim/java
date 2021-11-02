package java1102_api;

/*
 * ex) 0.5689....=>5.7
 */


public class Java127_Math {

	public static void main(String[] args) {
		double nan = Math.random();
		System.out.println(nan);
		
		nan = nan * 100;
		System.out.println(nan);
		
		long data = Math.round(nan);
		System.out.println(data);
		
		double num = (double)data/10;
		System.out.println(num);
	}

}
