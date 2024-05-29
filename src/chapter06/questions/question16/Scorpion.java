package chapter06.questions.question16;

public class Scorpion extends Arachnid {

	static {
		sb.append("q");
	}
	{
		sb.append("m");
	}

	public static void main(String[] args) {
		System.out.print(Arachnid.sb + " ");
		System.out.print(Arachnid.sb + " ");
		new Arachnid();
		new Scorpion();
		System.out.print(Arachnid.sb);
	}
}

//uq uq uqcrcrm