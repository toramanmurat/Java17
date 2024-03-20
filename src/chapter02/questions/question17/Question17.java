package chapter02.questions.question17;

public class Question17 {

	public static void main(String[] args) {
		int ticketsTaken = 1;
		int ticketsSold = 3;
		ticketsSold += 1 + ticketsTaken++;
		ticketsTaken *= 2;
		ticketsSold += (long)1;
		
		System.out.println(ticketsTaken);
		System.out.println(ticketsSold);
	}
}
