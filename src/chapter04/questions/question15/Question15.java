package chapter04.questions.question15;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
		var arr = new String[] { "PIG", "pig", "123" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "Pippa"));
	}
}
