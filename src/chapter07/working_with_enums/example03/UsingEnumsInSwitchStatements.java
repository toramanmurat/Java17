package chapter07.working_with_enums.example03;

import chapter07.working_with_enums.example01.Season;

public class UsingEnumsInSwitchStatements {

	public static void main(String[] args) {
		Season summer=Season.SUMMER;

		switch (summer) {
		case WINTER: {

			System.out.println("Get Out the sled! ");
			break;
		}
		case SUMMER:{
			System.out.println("Time for the pool! ");
			break;
		}

		default:
			System.out.println("Is is summer yet ?");

		}
	}

}
