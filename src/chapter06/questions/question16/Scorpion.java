package chapter06.questions.question16;

public class Scorpion extends Arachnid {

	static {
		sb.append("q");
	}
	{
		sb.append("m");
	}

	public static void main(String[] args) {
		System.out.print(Scorpion.sb + " ");
		System.out.print(Scorpion.sb + " ");
		new Arachnid();
		new Scorpion();
		System.out.print(Scorpion.sb);
	}
}

//uq uq uqcrcrm