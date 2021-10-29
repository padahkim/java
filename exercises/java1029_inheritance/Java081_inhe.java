package java1029_inheritance;

/*
 * [출력결과]
 * 1000량의 물을 뿌린다
 * 8인승 차량입니다.
 */


class Car{
	private int speed;
	private String color;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}
} //end Car

class FireEngine extends Car{
	
	private long water;	

	public void setWater(long water) {
		this.water = water;
	}

	public void waterSpread() {
		System.out.println(water + "량의 물을 뿌린다.");
	}

}// end FireEngine

class OwnerEngine extends Car{	
	private int seat;	
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	public void information() {
		System.out.println(seat + "인승 차량입니다.");
	}
}// end OwnerEngine

public class Java081_inhe {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.waterSpread();
		
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.information();     
	}// end main()

}// end class
