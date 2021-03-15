package FinalExam;


class A{
	protected int value;
	public A() {
		System.out.println("CtrA");
		value =10;
	}
	
}
class B extends A{
	public B() {
		System.out.println("CtrB");
		value = 20;
		
	}
	public void print() {
		System.out.println(value);
	}
//	public static void test() {
//		 B b = new B();
//		 b.print();
//	}
}
public class bai3 {
public static void main(String[] args) {
	 B b = new B();
	 b.print();
}
}
