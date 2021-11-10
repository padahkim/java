package ncs.test08;

public class UserTest {

	public static void main(String[] args) {
		User[] user = new User[3];
		
		
		user[0] = new User("user01","pass01","kim",32,'M',"010-1234-5667");
		user[1] = new User("user02","pass02","lee",22,'F',"010-5678-5667");
		user[2] = new User("user03","pass03","jason",17,'M',"010-0985-5667");
		
		User[] copyUsers = (User[])user.clone();
		
		
		System.out.println("users list-----------------------------------");
		for(User data:user) {
			System.out.println(data.toString());
		}
		System.out.println("copyUsers list-----------------------------------");
		for(User data:copyUsers) {
			System.out.println(data.toString());
		}
		System.out.println("비교결과-----------------------------------");
		for(int i=0;i<user.length;i++) {
			System.out.println(user[i].equals(copyUsers[i]));
		}
	}

}
