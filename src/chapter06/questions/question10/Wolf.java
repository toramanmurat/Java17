package chapter06.questions.question10;

public class Wolf extends Howler{

	protected Wolf(String stars) {
		super(2L);
	}

	public Wolf() {
		this(""); //A
//		super(1); //B Does Nor Compile
//		this(null); //C
//		super(); //D Does Not Compile
//		super((short)2); //E Does Not Compile
//		super(null); //F Does Not Compile
	}

	public static void main(String[] args) {
		Wolf w=new Wolf();
	}
}
