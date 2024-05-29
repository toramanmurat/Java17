package chapter04.questions.question21;

public class Question21 {

	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
//		methodD();
	}

	private static void methodA() {
		var puzzle = new StringBuilder("Java");
		puzzle.reverse();
		System.out.println(puzzle);//avaJ

	}

	private static void methodB() {
		var puzzle = new StringBuilder("Java");
		puzzle.append("vaJ$").substring(0, 4);
		System.out.println(puzzle); //JavavaJ$


	}

	private static void methodC() {
		var puzzle = new StringBuilder("Java");
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.println(puzzle); //avaJ

//
	}

	private static void methodD() {
		var puzzle = new StringBuilder("Java");
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
		System.out.println(puzzle); //java.lang.StringIndexOutOfBoundsException
	}

}
