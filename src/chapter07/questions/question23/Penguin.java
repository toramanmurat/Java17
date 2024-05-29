package chapter07.questions.question23;

public class Penguin implements Swim, Dance {
	@Override
	public void perform() {
		System.out.print("Smile!");
	}

	private void doShow() {
		Swim.super.perform();
	}

	public static void main(String[] eggs) {
		new Penguin().doShow();

	}

}

interface Swim {
	default void perform() {
		System.out.print("Swim!");
	}
}

interface Dance {
	default void perform() {
		System.out.print("Dance!");
	}
}
