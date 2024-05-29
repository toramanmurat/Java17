package chapter04.understanding_arrays;

import java.util.Arrays;

public class UsingAnArray2 {

	public static void main(String[] args) {
		var numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
		}
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
