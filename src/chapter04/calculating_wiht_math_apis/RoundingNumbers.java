package chapter04.calculating_wiht_math_apis;

public class RoundingNumbers {

	public static void main(String[] args) {
		long low = Math.round(123.45); // 123
		long high = Math.round(123.50); // 124
		int fromFloat = Math.round(123.45f); // 123

		System.out.println(low+"\n"+high+"\n"+fromFloat);
	}

}

//public static long round(double num)
//public static int round(float num)