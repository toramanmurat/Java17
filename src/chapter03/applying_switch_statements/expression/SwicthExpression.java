package chapter03.applying_switch_statements.expression;

public class SwicthExpression {

	public static void main(String[] args) {
//		int day = 10;
		printDayOfWeek(10);
		printDayOfWeek(3);

		printDayOfWeekV2(0);

	}

	public static void printDayOfWeek(int day) {
		var result = switch (day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid Value";
		};// ; koymaliyiz.

		System.out.println(result);

	}

	public static void printDayOfWeekV2(int day) {
		var result = switch (day) {
		case 0 -> {
			yield "Sunday"; // {} kullanirsak yield kullanmamiz gerekiyor yoksa calismaz.
//			System.out.println("Does Not Compile");
		}

//		case 1 -> {"Monday"}; Does Not Compile
//		case 1 -> return "Monday"; Does Not Compile
		case 1 -> "Monday";
//		case 1-> "Friday"; Does Not Compile. case 1 , case 1 olmaz!

		case 2 -> {
			System.out.println("Valid");
			yield "Tuesday";
		}

		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid value";

		};

		System.out.println(result);
	}
}
