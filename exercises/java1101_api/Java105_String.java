package Java1101_api;
//java.lang.String String은 굳이 임포트 안해도 자동으로 사용가능
public class Java105_String {

	public static void main(String[] args) {
		String sn = "java";
		String sg = "java";
		
		String st = new String("java");
		String ss = new String("java");
		//주소비교
		System.out.printf("sn==sg:%b\n", sn==sg);
		System.out.printf("st==ss:%b\n", st==ss);
		//eauals():메모리에 저장된 문자열 비교
		System.out.printf("sn.eguals(sg):%b\n",sn.equals(sg));
		System.out.printf("sn.eguals(sg):%b\n",st.equals(ss));
		//toString():메모리에 저장된 문자열 리턴
		System.out.println(sn);
		System.out.println(sn.toString());
		//getClass():객체의 클래스 리턴
		System.out.println(sn.getClass());
	}

}
