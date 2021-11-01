package Java1101_api;

public class Java107_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		String ip = sn.substring(0, 9);
		String port = sn.substring(9);
		System.out.println("ip:"+ip);
		System.out.println("port"+port);
		
		
		//indexOf(),substring()
		int index = sn.indexOf(":");
		System.out.println("ip:"+sn.substring(0,index));
		System.out.println("port:"+sn.substring(index+1));
		//split()
		String [] arr = sn.split(":");
		System.out.println("ip:"+arr[0]);
		System.out.println("ip:"+arr[1]);
		
	}

}
