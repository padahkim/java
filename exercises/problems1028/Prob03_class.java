package java1028_class.prob01;
/*
 * [출력결과]
 * 이름         	 투구이닝     	자책점     	  방어율
 * 박찬호       	  101        56       4.99
 * 노모히데오   	  100        46       4.14
 * 베이브루스   	  110        70      14.14
 * 김광현        	  109        68       5.61
 * 류현진        	  129        55       3.83
 */

class Pitcher{
	String name;//이름
	int  ining;//투구이닝
	int run;//자책점
	double era;//방어율
	
	//생성자를 구현하시오
	Pitcher(String name, int ining, int run, double era){
		this.name = name;
		this.ining = ining;
		this.run = run;
		this.era = era;
	}
	
	public String toString(){
	//이름 투구이닝 자책점 방어율 순으로 출력할 메소드 구현하시오.		
		return name+"    "+ining+"    "+run+"    "+era;
	}//end toString()
}//end class Pitcher
	
public class Prob03_class {	
	public static void main(String[] args) {
		Pitcher[] arr=new Pitcher[5];
		//문제를 풀때 아래 주석을 해제합니다.
		 arr[0]=new Pitcher("박찬호",101,56,4.99);
		 arr[1]=new Pitcher("노모히데오",100,46,4.14);
		 arr[2]=new Pitcher("베이브루스",110,70,14.14);
		 arr[3]=new Pitcher("김광현",109,68,5.61);
		 arr[4]=new Pitcher("류현진",129,55,3.83);
		 	display(arr);	 
	}//end main()
	
	public static void display(Pitcher[] arr){
		System.out.print("이름        투구이닝    자책점     방어율\n");
		for(Pitcher data: arr) {
			System.out.println(data.toString());
		}
		
		
	}//end display( )

}//end class



