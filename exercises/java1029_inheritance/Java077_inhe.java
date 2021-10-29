package java1029_inheritance;

class Parent extends Object{//extend obj는 굳이 안씀 원래, 슈퍼가 오브젝트 빈생성자 호출한다는 걸 공부
	String name;
	int age;
	public Parent() {
		
	}

public Parent(String name, int age) {//
		super();
		this.name = name;//6
		this.age = age;//7
	}
	
	
}

class Sun extends Parent{
		String dept;
		public Sun() {
			
		}
		
		public Sun(String name, int age, String dept) {//3
			super(name, age);//4
			this.dept = dept;//9
		}//10
		
		public void prn() {//12
			System.out.printf("%s %d %s\n", name, age,dept);
		}//14
	
	}	
	
	

public class Java077_inhe {

	public static void main(String[] args) {//1
		Sun ss = new Sun("hong",50,"기획");//2
		ss.prn();//11
	}//15

}
