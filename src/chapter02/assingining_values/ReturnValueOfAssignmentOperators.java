package chapter02.assingining_values;

public class ReturnValueOfAssignmentOperators {

	public static void main(String[] args) {
		long wolf = 5;
		long coyote = (wolf=3); // atama yapabiliriz.
		System.out.println(wolf); // 3
		System.out.println(coyote); // 3

		boolean healthy = false;
		if(healthy = true) { //healthy true assign ediliyor.
			System.out.print("Good!");
		}
	}
}
