package chapter06.questions.question24;

public class Gazelle extends Antelope {
	public Gazelle(int p) {
		super(6);
		System.out.print("3");
	}

	public static void main(String hopping[]) {
		new Gazelle(0);
	}

	static {
		System.out.print("8");
	}
	{
		System.out.print("9");
	}
}


//182493