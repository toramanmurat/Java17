package chapter06.questions.question20;

public class Parrot extends Bird{
	protected Parrot(int y) {
		super(y);
	}

	@Override
	protected Parrot fly() {
		return new Parrot(2);
	}
}
