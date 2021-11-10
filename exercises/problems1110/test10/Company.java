package ncs.test10;

public class Company {

	
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		Secretary se =  new Secretary("Hilery",1,"secretry",800);
		Sales sa = new Sales("Clinten",2,"sales",1200);
		
		employees[0]=se;
		employees[1]=sa;
		/*
		employees[0] = new Secretary("Hilery",1,"secretry",800);
		employees[1] = new Sales("Clinten",2,"sales",1200);
		*/
		System.out.println("name \t department \t salary");
		
		for (Employee data: employees) {
			System.out.println(data.getName()+"\t"+data.getDepartment()+"\t"+data.getSalary());
		}
		
		
		
		System.out.println("---------인센티브 100 지급------------");
		System.out.println("name \t department \t salary");
		
		se.incentive(1200);
		sa.incentive(800);
		/*
		Sales salesEmployee=(Sales)employees[1];
		salesEmployee.incentive(1200);
		
		Secretary secretaryEmployee = (Secretary)employees[0];
		secretaryEmployee.incentive(800);
		*/
		
		for (Employee data: employees) {
			System.out.println(data.getName()+"\t"+data.getDepartment()+"\t"+data.getSalary()+"\t"+data.tax());
		}
		
		
	}

}
