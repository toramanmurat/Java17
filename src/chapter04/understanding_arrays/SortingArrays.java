package chapter04.understanding_arrays;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		System.out.println();
		System.out.println("#String Sort(alphabetic)");
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String s : strings)
			System.out.print(s + " "); //10 100 9
	}
}
