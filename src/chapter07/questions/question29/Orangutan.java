package chapter07.questions.question29;

public class Orangutan {
	protected int age = 4;
	{
		age = 5;
	}

	public Orangutan() {
//	 this().age = 6;
		this.age = 6;
	}

	public static void main(String[] bananas) {
//		final Primate x = (Primate) new Orangutan();
//		System.out.println(x.age);
	}



}



class Primate {
	protected int age = 2;
	{
		age = 1;
	}

	public Primate() {
//		this().age = 3;
		this.age = 3;
	}
}