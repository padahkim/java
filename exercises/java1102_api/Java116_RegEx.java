package java1102_api;

/*
 * java
 * jsp
 * spring
 */

public class Java116_RegEx {

	public static void main(String[] args) {
		String data = "java/jsp:spring";
		process(data);
	}//end main()
	
	public static void process(String data) {
		String[] subject = data.split(":");
		for(String chk : subject)
			System.out.println(chk);
		
		String[] subject1 = data.split(":/");
		for(String chk : subject1)
			System.out.println(chk);
		
		String[] subject2 = data.split(":/");
		for(String chk : subject2)
			System.out.println(chk);
		
		String[] subject3= data.split("[/:]");
		for(String chk : subject3)
			System.out.println(chk);
	}

}
