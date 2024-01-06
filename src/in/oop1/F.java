package in.oop1;

public class F extends E{

	public void m3() {
		super.m1();
		System.out.println(super.m2(10,20));
		System.out.println("call m3");
	}
	public static void main(String[] args) {
		F o = new F();
		o.m3();
	}
}
