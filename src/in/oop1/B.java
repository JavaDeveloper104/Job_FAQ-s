package in.oop1;

public class B extends A{

	public void m2() {
		System.out.println("call m2");
		super.m1();
	}
	
	public static void main(String[] args) {
		B o = new B();
//when we initialize child class constructor 
// internally child class constructor call parent class constructor like this
	/*
	 public B(){
	 				super();  }
	 */
		o.m2();
	}
}
