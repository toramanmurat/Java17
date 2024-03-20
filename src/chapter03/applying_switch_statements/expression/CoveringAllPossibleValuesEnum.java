package chapter03.applying_switch_statements.expression;

public class CoveringAllPossibleValuesEnum {

	public static void main(String[] args) {
		System.out.println(getWeather(Season.SPRING));
	}

	private static String getWeather(Season value) {
		return switch (value) {
		case WINTER -> "Cold";
		case SPRING -> "Rainy";
		case SUMMER -> "Hot";
		case FALL -> "Warm";
		};
	}
}

enum Season {
	WINTER, SPRING, SUMMER, FALL
}

// case yapilarina butun enumlari kullanmamiz gerekiyor.