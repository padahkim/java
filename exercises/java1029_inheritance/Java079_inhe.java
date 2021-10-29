package java1029_inheritance;

class PetOver{
	int age; //애완동물 개월수
	public void move() {
		System.out.println("슈퍼클래스 move(): 애완동물이 움직입니다");
	}
}

class BirdOver extends PetOver{
	@Override
	public void move() {
		System.out.println("서브클래스 move(): 새가 날아갑니다.");
	}
}

class DogOver extends PetOver{
	@Override
	public void move() {
		System.out.println("서브클래스 move(): 강아지가 걸어갑니다.");
	}
}


public class Java079_inhe {

	public static void main(String[] args) {
		BirdOver bird = new BirdOver();
		bird.move();
		PetOver pet = new PetOver();
		pet.move();
		DogOver dog = new DogOver();
		dog.move();
	}

}
