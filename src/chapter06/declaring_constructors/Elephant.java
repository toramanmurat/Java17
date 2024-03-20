package chapter06.declaring_constructors;

public class Elephant extends Mammal {
	
//	public Elephant() {}  Does Not COmpile
	
//	public Eleptant() { super (); } //Does Not Compile
	
	public Elephant() {
		super(4);
	}

}
