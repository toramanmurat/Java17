package chapter04.understanding_arrays;


import java.util.Arrays;

public class UsingAnArray3 {

	public static void main(String[] args) {
		var numbers = new int[10];
		numbers[10] = 3; //java.lang.ArrayIndexOutOfBoundsException numbers[9]
		numbers[numbers.length] = 5; // java.lang.ArrayIndexOutOfBoundsException/ numbers[numbers.length-1]
		for (int i = 0; i <= numbers.length-1; i++)
			numbers[i] = i + 5;
		
		System.out.println(Arrays.toString(numbers));
	}
}
