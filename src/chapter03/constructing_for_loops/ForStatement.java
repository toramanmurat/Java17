package chapter03.constructing_for_loops;

public class ForStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
		 {
			System.err.println("Values is: " + i);
//		System.out.println(i); Does Not Compile
		}

		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("Value is:" + i);
		}
		System.out.println(i);

		for (int j = 0; j < 5; j++) {
			System.out.print(j + " ");
		}
	}

}
