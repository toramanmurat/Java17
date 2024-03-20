package chapter05.passing_Data_among_methods;

public class Swap {

	public static void main(String[] args) {
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1); // 1
		System.out.println(original2); // 2

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
}
