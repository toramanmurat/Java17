package chapter06.questions.question10;

public class Howler {

	public Howler(long shadow) {
		this(3); //A 
//		this(); //B Does Not COmpile
//		this((short)1); //C
//		super(); //D
//		this(2L); //E Does Not Compile
//		this(5); //F Does Not Compile
	}
	private Howler(int moon) {
		super();
	}
}
