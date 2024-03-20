package chapter03.applying_switch_statements.expression;

public class ApplyingACaseBlock2 {

	public static void main(String[] args) {
		yieldRequired();
	}

	private static void yieldRequired() {
		int fish = 5;
		int length = 12;
		var name = switch (fish) {
		case 1 -> "Goldfish";
		case 2 -> {
			yield "Trout"; // {} kullanirsak yield kullanmaliyiz
		}
		case 3 -> {
			if (length > 10)
				yield "Blobfish";
			else
				yield "Green";
		}
		default -> "Swordfish"; //default zorunlu.
		};

		System.out.println(name);

	}
}
