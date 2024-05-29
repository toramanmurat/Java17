package chapter03.questions.question16;

public class Question16 {

	public static void main(String[] args) {

		methodA();
		System.out.println("\n-----");
		methodB();
		System.out.println("\n-----");
//		methodC();  java.lang.ArrayIndexOutOfBoundsException
//		System.out.println("\n-----");
		methodD();
		System.out.println("\n-----");
//		methodE(); sonsuz dongu
//		System.out.println("\n-----");
		methodF(); //java.lang.ArrayIndexOutOfBoundsException
		System.out.println("\n-----");

	}

	private static void methodA() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		int q = wolf.length; // q=5;
		for (;;) {
			System.out.print(wolf[--q]); // [q--] olsa kod hata verirdi.
			if (q == 0) {
				break;
			}
		}
	}

	private static void methodB() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		for (int m = wolf.length - 1; m >= 0; --m) {
			System.out.print(wolf[m]);
		}
	}

	private static void methodC() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		for (int z = 0; z < wolf.length; z++)
		 {
			System.out.print(wolf[wolf.length - z]); // wolf[5-0] dizi boyutunu astigi icin
														// ArrayIndexOutOfBoundsException
		}
	}

	private static void methodD() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		int x = wolf.length - 1;
		for (int j = 0; x >= 0 && j == 0; x--) {
			System.out.print(wolf[x]);
		}
	}

	private static void methodE() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		final int r = wolf.length;
		for (int w = r - 1; r > -1; w = r - 1) {
			System.out.print(wolf[w]);
		}

	}

	private static void methodF() {
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };
		for (int i = wolf.length; i > 0; --i) {
			System.out.print(wolf[i]);
		}
	}

}
