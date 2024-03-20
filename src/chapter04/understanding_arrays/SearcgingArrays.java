package chapter04.understanding_arrays;

import java.util.Arrays;

public class SearcgingArrays {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8 };
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5

		System.out.println("Example2");
		// binarySearch yaparken dizimiz sirali olmalidir.
		int[] numbers2 = new int[] { 3, 2, 1 };
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2

		Arrays.sort(numbers2);
		System.out.println(Arrays.binarySearch(numbers2, 1)); // 0
		System.out.println(Arrays.binarySearch(numbers2, 3)); // 2
	}

}
