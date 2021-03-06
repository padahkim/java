package java1029_abstract_interface.prob;

/*
 * MotorBicycle클래스가 아래와 같이 출력이 되도록 구현하세요.
 * 
 * 
 * [출력결과]
 * ID : 900
 * Brand : Yamaha
 * Frame Size : 16
 * Motor Size : 100
 * ## 모터 start!!
 * ## 모터 stop!!
 */


// 인터페이스 선언
 interface IBicycle {
    // 상수 선언
    int FrameSize_L = 18;
    int FrameSize_M = 16;
    int FrameSize_S = 15;
    // 추상 메소드 선언
    abstract void prtInfo();
}

 interface IMotor {
	int Motor_Size_Small = 20;
	int Motor_Size_Large = 100;
	
	void start();
	void stop();
}

 
class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    
    // IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
    	System.out.println("ID :"+id);
    	System.out.println("Brand :"+brand);
    	System.out.println("Frame Size :"+FrameSize_M);
    	System.out.println("Motor Size :"+Motor_Size_Large);
    	
        //여기
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
    	System.out.println("## 모터 start!!");
       //여기
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
    	System.out.println("## 모터 stop!!");
        //여기
    }
}

public class Prob003_interface {

	public static void main(String[] args) {
		 MotorBicycle mb = new MotorBicycle();
	        mb.id = 900;
	        mb.brand = "Yamaha";
	        mb.prtInfo();
	        mb.start();
	        mb.stop();
	}//end main()

}//end class
