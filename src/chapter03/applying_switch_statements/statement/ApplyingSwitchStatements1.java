package chapter03.applying_switch_statements.statement;

public class ApplyingSwitchStatements1 {


	public static void main(String[] args) {
		int day=5;
		printDayOfWeekV1(day);

		printDayOfWeekV2(day);
		printDayOfWeekV2(day=4);
		printDayOfWeekV2(day=10);



	}

	public static  void printDayOfWeekV1(int day) {
		if (day==0) {
			System.out.println("Sunday");
		} else if(day==1) {
			System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		} else if(day==3) {
			System.out.println("Wednestay");
		} else if(day==4) {
			System.out.println("Thursday");
		} else if(day==5) {
			System.out.println("Friday");
		} else {
			System.out.println("Saturday");
		}

	}

	public static void printDayOfWeekV2(int day) {
		switch (day) {
		case 0: {
			System.out.println("Sunday");
			break;
		}
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednestay");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Value");
			break;

		}
	}




}
