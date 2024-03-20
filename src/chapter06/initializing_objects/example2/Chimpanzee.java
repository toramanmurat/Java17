package chapter06.initializing_objects.example2;

public class Chimpanzee extends Ape {
	public Chimpanzee() {
		super(2);
		System.out.print("Chimpanzee-");
	}

	public static void main(String[] args) {
		new Chimpanzee();
	}
	
	

}
