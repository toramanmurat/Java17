package chapter03.creating_decision_making_statements.if_statement;

public class ElseStatement {

	public static void main(String[] args) {
//		int hourOfDay = 10; Good Morning
//		int hourOfDay = 12; Good Afternoon
		int hourOfDay = 17; //Good Evening

		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		}

		if (hourOfDay >= 11) {
			System.out.println("Good Afternoon");
		}

		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Afternoon");
		}

		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}

	}
}
