package ncs.test09;

public class Cargoplane extends Plane{
	
	
	public Cargoplane() {}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize()-distance*5);
		System.out.println(getPlaneName()+"\t"+getFuelSize());
		
	}
	
	/*
	public void setFuelSize(int fuelSize) {
		
		System.out.println(getPlaneName()+"\t"+getFuelSize());
	}
	*/
}
