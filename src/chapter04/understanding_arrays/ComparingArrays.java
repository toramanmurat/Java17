package chapter04.understanding_arrays;

import java.util.Arrays;

public class ComparingArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 1 })); // 0
		System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 2 })); // negative
		System.out.println(Arrays.compare(new int[] { 1, 2 }, new int[] { 1 })); // positive
		System.out.println(Arrays.compare(new int[] { 1, 2 }, new int[] { 2 })); // negative
		System.out.println(Arrays.compare(new int[] { 1, 2, 5, 3, 20 }, new int[] { 3 })); // negative
	}

}

// Negative : birinci array ikinci arrayden kucuktur.
// Zero: bu array'ler equal
// Positive: birinci array ikinci arrayden buyuktur.

//eleman sayisina bakmaz 