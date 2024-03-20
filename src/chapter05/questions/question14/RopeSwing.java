package chapter05.questions.question14;

public class RopeSwing {
	private static final String leftRope;
	private static final String rightRope;
//	private static final String bench;
	private static final String name = "name";
	static {
		leftRope = "left";
		rightRope = "right";
	}
	static {
//		name = "name"; Does Not Compile. static final degiskenlere 1 kere deger atamasi yapilir.
//		rightRope = "right"; Does Not Compile. static final degiskenlere 1 kere deger atamasi yapilir.
	}

	public static void main(String[] args) {
//		bench = "bench"; Does Not Compile. ya ilk tanimladigimizda yada static bloklar icerisinde yapilmasi gerekir.s
	}

}
