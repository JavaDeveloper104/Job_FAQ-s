package in.oop1;

public class H {

	public void m() {
		System.out.println("m method call");
	}
	public H() {
		this.m();//when we add this or this() then it will not call super or super()
		System.out.println("zero param constructor call");
	}

	public static void main(String[] args) {
		H o = new H();
	}

}
