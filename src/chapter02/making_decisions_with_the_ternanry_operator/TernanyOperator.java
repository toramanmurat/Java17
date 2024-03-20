package chapter02.making_decisions_with_the_ternanry_operator;

public class TernanyOperator {

	public static void main(String[] args) {
		withoutTernary();
		withTernary();

	}

	private static void withoutTernary() {
		int owl = 5;
		int food;
		if (owl < 2) {
			food = 3;
		} else {
			food = 4;
		}
		System.out.println(food); // 4
	}

	private static void withTernary() {
		int owl = 5;
		int food = owl < 2 ? 3 : 4; //eger owl 2 den kucuk ise ilk ifade, degil ise ikinci ifade calisir.
		System.out.println(food);
	}
}

// booleanExpression ? expression1 : expression2 seklindedir.
