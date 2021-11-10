package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("L747",1000);
		Cargoplane cargoplane = new Cargoplane("C40",1000);
		
		System.out.println("Plane\tfuelSize");
		System.out.println(airplane.toString());
		System.out.println(cargoplane.toString());
		
		
		System.out.println("-------100운항--------");
		airplane.flight(100);
		cargoplane.flight(100);
		//System.out.println(airplane.toString());1000으로나옴
		//System.out.println(cargoplane.toString());1000으로초기화되서 나옴
		
		System.out.println("-------200주유--------");
		airplane.refuel(200);
		cargoplane.refuel(200);
		//cargoplane.setFuelSize(200);
		//System.out.println(airplane.toString());
		//System.out.println(cargoplane.toString());
	}

}
