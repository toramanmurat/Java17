package chapter05.accessing_static_data;

public class Giraffe {
	public void eat(Giraffe g) {
		drink();
	}

	public void drink() {
		eat(this);
	}

	public static void allGiraffeGoHome(Giraffe g) {
		allGiraffeComeOut();
//		drink(); Does Not Compile
	}

	public static void allGiraffeComeOut() {
		Giraffe g=new Giraffe();
		g.drink();
	}

}
