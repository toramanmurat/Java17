package chapter03.controlling_flow_with_branching;

public class NestedLoops {

	public static void main(String[] args) {
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

		for (int[] mySimpleArray : myComplexArray) {
			for (int element : mySimpleArray) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
