package java1029_abstract_interface;

/*
 * 피아노:손가락
 * 플룻:입
 */

abstract class Instrument{
	String name;
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public abstract void play();
}//end Instrument

class Piano extends Instrument{
	
	public Piano(String name) {
		super(name);
	}
	@Override
	public void play() {
		System.out.println(name+"은 손가락으로 연주한다");
	}
}

class Flute extends Instrument{
	
	public Flute(String name) {
		super(name);
	}
	@Override
	public void play() {
		System.out.println(name+"은 입으로 연주한다");
	}
}


public class Java089_abstract {

	public static void main(String[] args) {
		Piano p = new Piano("Piano");
		p.play();
		Flute f = new Flute("Flute");
		f.play();

	}

}
