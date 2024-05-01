package chapter07.questions.question17;

public interface Omnivore {
	int amount = 10;
	static boolean gather = true;
	static void eatGrass() {}
//	int findMore() { return 2; }
	default float rest() { return 2; }
//	protected int chew() { return 13; } intercafe metodlari protected olamaz.
	private static void eatLeaves() {}
}
