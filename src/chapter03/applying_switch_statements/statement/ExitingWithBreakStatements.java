package chapter03.applying_switch_statements.statement;

public class ExitingWithBreakStatements {

	public static void main(String[] args) {
		int month=6;
		printSeason(month); // break olmadigindan hangi case giriyorsa ondan sonra butun caselere girer.
		System.out.println("\n--------------- breakk");

		printSeasonWithBreak(month);
		System.out.println("\n---------------");


		// switch icerisinde ki default en sonda olmak zorunda degil
		printSeason(month=15);
		System.out.println("\n--------------- breakk");
		printSeasonWithBreak(month=15);



	}

	public static void printSeason(int month) {
		switch (month) {
		case 1, 2, 3:
			System.out.print("Winter");
		case 4, 5, 6:
			System.out.print("Spring");
		default:
			System.out.print("Unknown");
		case 7, 8, 9:
			System.out.print("Summer");
		case 10, 11, 12:
			System.out.print("Fall");
		}
	}

	public static void printSeasonWithBreak(int month) {
		switch (month) {
		case 1, 2, 3:
			System.out.print("Winter");
			break;
		case 4, 5, 6:
			System.out.print("Spring");
			break;
		default:
			System.out.print("Unknown");
			break;
		case 7, 8, 9:
			System.out.print("Summer");
			break;
		case 10, 11, 12:
			System.out.print("Fall");
			break;
		}
	}
}
