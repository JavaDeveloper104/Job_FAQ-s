package in.oop1;

public class D extends C{
	
	public D(int a) {
		// it internally add super()
		System.out.println("class d zero param constructor");
	}

public D(String name) {
	super(101);
	System.out.println("we can customize const calls by adding parameters to super() to call which const");
	}

public static void main(String[] args) {
	//D o = new D(101);
	D c = new D("Java");
}
	
}
