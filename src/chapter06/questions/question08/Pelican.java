package chapter06.questions.question08;

public class Pelican extends Bird {
	public Pelican() {
		System.out.print("Oh-");
	}

	protected void fly() {
		System.out.println("Pelican");
	}
	public static void main(String[] args) {
		var chirp = new Pelican();
		chirp.fly();
	}
}

//Wow-Oh-Pelican