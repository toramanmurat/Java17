package chapter03.questions.question19;

public class Question19 {

	public static void main(String[] args) {
		double iguana = 0;
		int snake = 1;
		do {
//			int snake = 1;
			System.out.print(snake++ + " ");
			iguana--;
		} while (snake <= 5); // do while dongusu icerisinde tanimlarsak snake degiskenine erisim saglanamaz.
		System.out.println(iguana);
	}
}
