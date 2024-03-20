package chapter04.understanding_arrays;

import java.util.Arrays;

public class MismatchArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.mismatch(new int[] { 1 }, new int[] { 1 })); // -1
		System.out.println(Arrays.mismatch(new String[] { "a" }, new String[] { "A" })); // 0
		System.out.println(Arrays.mismatch(new int[] { 1, 2 }, new int[] { 1 })); // 1
		System.out.println(Arrays.mismatch(new int[] { 1, 2, -1 }, new int[] { 1, 2, -1, 5 })); // 3
	}
}

//Array'ler esit ise -1 donecek.
//Array'ler esit degil ise ilk indexi bize verecek.