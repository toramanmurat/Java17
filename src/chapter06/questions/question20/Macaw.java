package chapter06.questions.question20;

public class Macaw extends Parrot{
	public Macaw(int z) {
		super(z);
	}

	public Macaw fly() {
		return new Macaw(3);
	}

	public static void main(String... sing) {
		Bird p = new Macaw(4);
		System.out.print(((Parrot) p.fly()).feathers);
	}

}
