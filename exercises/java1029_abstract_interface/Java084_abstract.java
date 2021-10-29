package java1029_abstract_interface;

abstract class Shape {
	private int width;
	private int height;
	
	public Shape() {
		
	}

	public double getArea(int width, int height) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	 public abstract double getArea();
}

class Rect extends Shape {
	Rect(int width, int height){
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}
}

class Triangle extends Shape{
	Triangle(int width, int height){
		super(width,height);
	}
	@Override
	public double getArea() {
		return getWidth()*getHeight()/2;
	}
	
}

public class Java084_abstract {

	public static void main(String[] args) {
		Rect rr = new Rect(10,20);
		System.out.println("사각형 넓이:"+rr.getArea());
		
		Triangle tt = new Triangle(10,20);
		System.out.println("삼각형 넓이"+tt.getArea());

	}//end main

}//end class
