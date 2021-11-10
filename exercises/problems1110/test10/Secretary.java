package ncs.test10;

public class Secretary extends Employee implements Bonus{
	public Secretary() {}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double tax() {
		return getSalary()*0.11;
	}
	@Override
	public void incentive(int pay) {
		setSalary(pay*1.1); 
	}
}
