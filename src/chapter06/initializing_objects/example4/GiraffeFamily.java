package chapter06.initializing_objects.example4;

public class GiraffeFamily {

	static {
		System.out.print("A");
	}

	{ System.out.print("B"); }

	public GiraffeFamily(String name) {
		this(1);
		System.out.print("C");
	}

	public GiraffeFamily() {
		 System.out.print("D");
	}

	public GiraffeFamily(int stripes) {
		System.out.print("E");
	}
}

//AFBECHG
//BECHG