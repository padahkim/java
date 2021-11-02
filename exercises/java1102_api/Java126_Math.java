package java1102_api;

public class Java126_Math {

	public static void main(String[] args) {
		//0.0부터~1.0미만 사이의 난수 발생
		double ran = Math.random();
		System.out.println(ran);
		
		//0.0~10.0미만 사이의 난수 발생
		ran = ran*10;
		System.out.println(ran);
		
		System.out.println(Math.floor(ran));
		int num = (int)Math.floor(ran);
		System.out.println(num);
		
	}

}
