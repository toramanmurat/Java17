package chapter02.questions.question04;

public class Question04 {

	public static void main(String[] args) {
		boolean canine = true, wolf = true;
		int teeth = 20;
		canine = (teeth != 10) ^ (wolf = false); //wolf'a burada false assign ediyoruz.
		System.out.println(canine + ", " + teeth + ", " + wolf);
		// true^false, true doner,
	}
}
