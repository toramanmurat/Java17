package chapter06.questions.question26;

public abstract class Whale {

	public abstract void dive();

	public static void main(String[] args) {
//		Whale whale = new Orca();
		Orca whale=new Orca();
		whale.dive(3);
	}

}
