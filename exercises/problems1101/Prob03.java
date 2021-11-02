package Java1101_binding.prob;
/*
 * [데이타]
 * 이름       부서     구분        급여          수당         근무일         일당
 * 홍길동    영업부   정직원   450000  1000
 * 갑동이    기획부   계약직                                    20     10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */
abstract class Employee1{
	String name;
	String department;
	String contract;
	Employee1(String name, String department, String contract){
		this.name = name;
		this.department = department;
		this.contract = contract;
	}
	public String toString() {
		return name+"\t"+department+"\t"+contract;
	}
	public String callName() {
		return name;
	}
	
	abstract int salaryInfo();
}



class FullTimeJob extends Employee1{
	int salary;
	int bonus;
	int sum;
	FullTimeJob(String name, String department, String contract,int salary,int bonus){
		super(name, department, contract);
		this.name = name;
		this.department = department;
		this.contract = contract;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	@Override
	int salaryInfo() {
		
		sum = salary+bonus;
		System.out.println(sum);
		return sum;
	}
	
}

class ContractJob extends Employee1{
	int daysOfWork;
	int salaryPerDay;
	int sum;
	ContractJob(String name, String department, String contract, int daysOfWork, int salaryPerDay){
		super(name, department, contract);
		this.name = name;
		this.department = department;
		this.contract = contract;
		this.daysOfWork = daysOfWork;
		this.salaryPerDay = salaryPerDay;
	}
	@Override
	int salaryInfo() {
		sum = daysOfWork*salaryPerDay;
		return sum;
	}
}


public class Prob03 {

	public static void main(String[] args) {
		Employee1[] h = new Employee1[] {new FullTimeJob("홍길동","영업부","정직원",450000,1000),new ContractJob("갑동이","기획부","계약직",20,10000)};
		
		for(Employee1 data: h) {
			display(data);
		}	
	/*
		for(Employee1 data: h) {
			System.out.println(data.callName()+"\t총급여:"+data.salaryInfo());
		}
	*/
	}//end main()
	
	public static void display(Employee1 data) {
		System.out.println(data.callName()+"\t총급여:"+data.salaryInfo());
	}
	
}//end class
