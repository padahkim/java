package java1104_collection;

public class Java158_Sort {

	public static void main(String[] args) {
		Integer a=10;
		Integer b=10;
		Integer c=5;
		System.out.println(a.compareTo(b));// == 0
		System.out.println(a.compareTo(c));// > 1
		System.out.println(c.compareTo(a));// < -1
		
		String aa = "ABC";
		String bb = "ABC";
		String cc = "ABCwesq";
		String dd = "ab";
		String ee = "0";
		
		System.out.println(aa.compareTo(bb)); //== 0
		System.out.println(aa.compareTo(dd)); //-32
		System.out.println(aa.compareTo(ee)); //17
		System.out.println(bb.compareTo(cc)); //-4
	}

}
