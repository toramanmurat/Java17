package chapter03.controlling_flow_with_branching;

public class AddingOptionalLabels2 {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for (int element : mySimpleArray) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
