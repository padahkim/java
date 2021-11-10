package ncs.test09;

public class Airplane extends Plane{
	
	public Airplane(){}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize()-distance*3);
		System.out.println(getPlaneName()+"\t"+getFuelSize());
	}
	
/*
	public void setFuelSize(int fuelSize) {
		leftFuel = leftFuel+fuelSize;
		System.out.println(getPlaneName()+"\t"+leftFuel);
	}
	*/
}
