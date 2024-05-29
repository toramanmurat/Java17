package chapter07.questions.question18;

public class Deer {
	enum Food {
		APPLES, BERRIES, GRASS
	}

	protected class Diet {
		private Food getFavorite() {
			return Food.BERRIES;
		}
	}

	public static void main(String[] args) {
//		System.out.print(switch(new Diet().getFavorite()) { //Does Not Compile
//		case APPLES ->
//		"a";
//		case BERRIES ->
//		"b";
//
//		default ->
//		"c";
//		});

		System.out.print(switch(new Deer().new Diet().getFavorite()) {
		case APPLES ->
		"a";
		case BERRIES ->
		"b";

		default ->
		"c";
		});
	}
}
