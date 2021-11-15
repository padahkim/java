package java1115_api.prob;

public class Prob004_Object {

	public static void main(String[] args) {
		Ningen p1 = new Ningen(183409813908403L);
		Ningen p2 = new Ningen(183409813908403L);
		
		if(p1==p2)
			System.out.println("p1과p2는 같은 사람입니다");
		else
			System.out.println("p1과p2는 다른 사람입니다");
		
		if(p1.equals(p2))
			System.out.println("p1과p2는 같은 사람입니다");
		else
			System.out.println("p1과p2는 다른 사람입니다");
	}

}
