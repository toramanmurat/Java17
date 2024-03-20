package chapter03.questions.question15;

public class Question15 {

	public static void main(String[] args) {
		final char a = 'A', e = 'E';
		char grade = 'B';
		switch (grade) {
		default:
		case a:
		case 'B', 'C': System.out.print("great "); // 'B' ve 'C' arasina : koyarsak compile error
		case 'D': System.out.print("good "); break;
		case e:
		case 'F': System.out.print("not good ");
		}
	}
}
