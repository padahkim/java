package ncs.test06;


public class Caculator  {
	int sum = 0;
	
	public Caculator () {
	}
	
	public double getSum (int data) throws InvalidException {
		if(data>=6||data<2) 
			//Exception e = new InvalidException("0~5로 넣어라")
			throw new InvalidException("0~5로 넣어라");
		
		for(int i=0; i<=data; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
