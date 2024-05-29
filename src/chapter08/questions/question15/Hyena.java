package chapter08.questions.question15;

import java.util.function.Predicate;

public class Hyena {
	private int age = 1;

	public static void main(String[] args) {
		var p = new Hyena();
		double height = 10;
		int age = 1;
		testLaugh(p, var -> p.age <= 10);
//		testLaugh(p, var -> shenzi -> age == 1); //Does Not Compile
//		testLaugh(p, var -> p -> true); //Does Not Compile
//		testLaugh(p, var -> age==1); //Does Not Compile
//		testLaugh(p, var -> shenzi -> age == 2); //Does Not Compile
		testLaugh(p, h ->h.age < 5 );
	}

	static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
		var r = joke.test(panda) ? "hahaha" : "silence";
		System.out.print(r);
	}
}
