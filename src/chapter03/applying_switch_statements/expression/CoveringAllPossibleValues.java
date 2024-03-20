package chapter03.applying_switch_statements.expression;

public class CoveringAllPossibleValues {

	public static void main(String[] args) {
		int canis = 2;
//       String type = switch (canis) { // DOES NOT COMPILE. Deger atamasi var default case de olmali
//           case 1 -> "dog";
//           case 2 -> "wolf";
//           case 3 -> "coyote";
//       };

		switch (canis) { // deger atamasi yok!
//         case 1 -> "dog";    // Not a statement. // DOES NOT COMPILE
//         case 2 -> "wolf";   // Not a statement. // DOES NOT COMPILE
//         case 3 -> "coyote"; // Not a statement. // DOES NOT COMPILE
//     };
		}

		switch (canis) {
		case 1 -> System.out.println("dog");
		case 2 -> System.out.println("wolf");
		case 3 -> System.out.println("coyote");
		}
		
		String type = switch (canis) {
		case 1 -> "dog";
		case 2 -> "wolf";
		case 3 -> "coyote";
		default -> throw new IllegalStateException("Unexpected value: " + canis);
		};
		
		int type2 = switch (canis) {
		case 1 -> 1;
		case 2 -> 2;
		case 3 -> 3;
		default -> throw new IllegalArgumentException("Unexpected value: " + canis);
	
		};

	}

}

//eger enum yapisi kullaniyorsa butun caseleri yazmaliyiz.