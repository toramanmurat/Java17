package chapter06.questions.question19;

public class Lizard extends Reptile {

	static {
		System.out.print("B");
	}

	public Lizard(int hatch) {
	}

	@Override
	public final void layEggs() {
		System.out.print("Lizard");
	}

	public static void main(String[] args) {
		var reptile = new Lizard(1);
		reptile.layEggs();
	}

}

//Reptile class'inda default constructor kendimin olusturduk.'