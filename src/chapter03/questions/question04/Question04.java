package chapter03.questions.question04;

public class Question04 {

	public static void main(String[] args) {
		printReptile(6);
	}

	static void printReptile(int category) {
		var type = switch (category) {
		case 1, 2 -> "Snake";
		case 3, 4 -> "Lizard";
		case 5, 6 -> "Turtle";
		case 7, 8 -> "Alligator";
		default -> throw new IllegalArgumentException("Unexpected value: " + category);
//		default case olmadigi icin kod hata verecektir.
		};

		System.out.println(type);
	}
}
