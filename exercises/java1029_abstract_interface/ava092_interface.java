package java1029_abstract_interface;

import java.io.Serializable;

interface SampleA{
	void prn();//public abstract
}//end SampleA

//interface가 interface를 상속할때 extends 사용//class를 구현할때 implements(구현)사용
interface SampleB extends SampleA, Serializable{
	void call();//public abstract
}//end SampleB

class Animal{
	void play() {
		System.out.println("animal");
	}
}//end Animal


//extends~~~한다음에 implements~~~를 해줘야함
class Life extends Animal implements SampleB{
	@Override
	public void call() {
		System.out.println("call");
	}
	
	@Override
	public void prn() {
		System.out.println("prn");
	}
}

public class ava092_interface {
	public static void main(String[] args) {
		Life ee = new Life();
		ee.call();
		ee.prn();
	}

}
