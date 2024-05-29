package chapter02.comparing_values;

public class LogicalOperators4 {
	public static void main(String[] args) {

		boolean eyesClosed = false;
		boolean breathingSlowly = false;

		boolean resting = eyesClosed | breathingSlowly;
		boolean asleep = eyesClosed & breathingSlowly;
		boolean awake = eyesClosed ^ breathingSlowly;
		System.out.println(resting); // true
		System.out.println(asleep); // true
		System.out.println(awake); // false


	}

}
