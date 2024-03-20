package chapter02.comparing_values;

public class CheckingforUnperformedSideEffects {

	public static void main(String[] args) {
		int rabbit = 6;
		boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
		System.out.println(rabbit); //6
	}
}
