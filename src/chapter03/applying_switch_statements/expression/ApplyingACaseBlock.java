package chapter03.applying_switch_statements.expression;

public class ApplyingACaseBlock {

	public static void main(String[] args) {
		yieldRequired();
	}

	private static void yieldRequired() {
		int fish = 5;
		int length = 12;
		var name = switch (fish) {
		case 1 -> "Goldfish";
//		case 2 -> {} Does Not Compile
		case 3 -> {
			if (length > 10)
				yield "Blobfish"; 
			else
				yield "Green"; // else blogunu kaldirirsak hata verecektir.
		}
		default -> "Swordfish"; //default zorunlu.
		};

		System.out.println(name);

	}
}
