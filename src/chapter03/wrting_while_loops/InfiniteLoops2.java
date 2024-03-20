package chapter03.wrting_while_loops;

public class InfiniteLoops2 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("infinite loop begins...");
			System.out.println("before break statement.");
			break;
		}

		System.out.println("after while loop.");
	}

}
