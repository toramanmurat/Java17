package chapter05.questions.question11;

public class Rope {

	public static void swing() {
		System.out.print("swing");
	}

	public void climb() {
		System.out.println("climb");
	}
	
	public static void play() {
		swing();
//		climb(); Does Not Compile
	}
	
	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		System.out.print("-"); 
		rope2.play(); //swing-swings
	}

}
