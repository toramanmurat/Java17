package chapter03.wrting_while_loops;

public class DoWhileStatement {

	public static void main(String[] args) {
		int lizard = 0;
		do {
			lizard++;
		} while (false);

		System.out.println(lizard);

		int counter = 0;
		do {
			double price = counter * 10;
			System.out.println(price);
			counter++;
		} while (counter < 10);
	}

}
