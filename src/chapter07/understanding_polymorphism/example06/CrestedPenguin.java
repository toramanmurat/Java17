package chapter07.understanding_polymorphism.example06;

public class CrestedPenguin extends Penguin {

	public static int getHeight() {
		return 8;
	}
	
	public static void main(String... fish) {
		new CrestedPenguin().printInfo();
	}
}

// metodlar static oldugundan dolayi @override olmayacaktir. 3 yazacaktir.