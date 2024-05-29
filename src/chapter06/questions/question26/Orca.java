package chapter06.questions.question26;

public class Orca extends Whale {
	static public int MAX = 3;

	@Override
	public void dive() {
		System.out.println("Orca diving");
	}

	public void dive(int... depth) {
		System.out.println("Orca diving deeper " + MAX);
	}
}
