package chapter03.applying_switch_statements.expression;

public class SwitchExpression2 {

	public static void main(String[] args) {
		semicolonRequired(30);
		semicolonRequired(10);
	}

	public static void semicolonRequired(int bear) {
//      var result = switch (bear) {
//      case 30 -> "Grizzly"
//      default -> "Panda"
//  }

		var result = switch (bear) {
		case 30 -> "Grizzly";
		default -> "Panda";
		};

		System.out.println(result);
	}
}
