package chapter03.applying_switch_statements.statement;

public class DeterminingAcceptableCaseValues {

	final int getCookies() {
		return 4;
	}

	void feedAnimals() {
		final int bananas = 1;
		int apples = 2;
		int numberOfAnimals = 3;
		final int cookies = getCookies();
		switch (numberOfAnimals) {
		case bananas:
//		case apples: // DOES NOT COMPILE. apples final degisken degil
//		case getCookies(): // DOES NOT COMPILE. metod kullanamayiz.
//		case cookies: // DOES NOT COMPILE. metod kullanamayiz.
		case 3 * 5:
		}
	}

}
