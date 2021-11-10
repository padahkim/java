package ncs.test09;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	Plane(){}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize = fuelSize + fuel;
		System.out.println(planeName+"\t"+fuelSize);
	}
	
	public abstract void flight(int distance);
	
	@Override
	public String toString() {
		return planeName+"\t"+fuelSize;
	}

	public int getFuelSize() {
		return fuelSize;
	}
	
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	
}