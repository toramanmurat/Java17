package chapter07.questions.question15;

public class Ghost {

	public static void boo() {
		System.out.println("Not scared");
	}

	protected final class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}

	public static void main(String[] args) {
//		var g = new Ghost().new Spirit() {};
		var g = new Ghost().new Spirit();
		g.boo();
new Ghost();
		//		g.super.boo();
		Ghost.boo();
//		g.Ghost.boo();
//		new Spirit().boo();
		Ghost.boo();




	}
}
