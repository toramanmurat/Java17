package chapter06.questions.question23;

public class Fox extends Canine {
	public Fox(long x) {
		print("p");
	}

	public Fox(String name) {
		this(2);
		print("z");
	}

}
