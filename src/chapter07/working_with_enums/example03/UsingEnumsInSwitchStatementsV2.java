package chapter07.working_with_enums.example03;

import chapter07.working_with_enums.example01.Season;

public class UsingEnumsInSwitchStatementsV2 {

	public static void main(String[] args) {
		Season summer=Season.SUMMER;

		var message=switch(summer) {
//		case Season.WINTER -> "Get out the saled !"; //Does Not Compile
		case WINTER -> "Get out the saled !";
//		case 0 -> "Time for the pool!"; //Does Not Compile
		default-> "Is it summer yet ?";
		};

		System.out.println(message);
	}
}
