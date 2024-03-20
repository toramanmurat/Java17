package chapter05.questions.question17;

public class Squares {

	public static long square(int x) {
		var y = x * (long) x;
		x = -1;
		return y;
	}

	public static void main(String[] args) {
		var value = 9;
		var result = square(value); //result=81
		System.out.println(value); //9
	}
}
