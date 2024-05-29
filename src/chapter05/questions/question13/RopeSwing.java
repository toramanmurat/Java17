package chapter05.questions.question13;

import chapter05.questions.question13.rope.Rope;

public class RopeSwing {
	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	{
		System.out.println(Rope.length);
	}

	public static void main(String[] args) {
		Rope.length = 2;
		Rope.length = 8;
		System.out.println(Rope.length);
	}

}
