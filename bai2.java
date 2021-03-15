package FinalExam;

class Shape {
	
	public void draw() {
		System.out.println("This is a shape");
	}
}
class Circle extends Shape{
	
	public void draw() {
		System.out.println("this is a circle");
		
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("This is a rectangle");
	}
}

public class bai2 <T>{

	public static void test() {
		bai2<Circle> nc = new bai2<Circle>();
		bai2<Rectangle> ns = new bai2<Rectangle>();
	}
	
}
