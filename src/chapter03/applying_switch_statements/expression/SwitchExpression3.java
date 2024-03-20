package chapter03.applying_switch_statements.expression;

public class SwitchExpression3 {

	public static void main(String[] args) {
		printSeason(8);
		String season=printSeasonV2(8);
		System.out.println(season);
	}

	public static void printSeason(int month) {
		switch (month) {
		case 1, 2, 3 -> System.out.println("Winter");
		case 4, 5, 6 -> System.out.println("Spring");
		case 7, 8, 9 -> System.out.println("Summer#");
		case 10, 11, 12 -> System.out.println("Fall");
		} //deger atamasi yapmadigimiz icin ; gerek yok.
	}
	
	public static  String printSeasonV2(int month) {
		var season= switch (month) {
		case 1, 2, 3 -> "Winter";
		case 4, 5, 6 -> "Spring";
		case 7, 8, 9 -> "Summer";
		case 10, 11, 12 -> "Fall";
		 // deger dondugumuz icin default olmak zorunda!!!
		default -> throw new IllegalArgumentException("Unexpected value: " + month);
		}; // season deger atamasi yaptigimiz icin ; gerekli!
		
		return season;
	}
	
	

}
